package com.abdo.cloudinary.controller;

import com.abdo.cloudinary.model.ImageUrl;
import com.abdo.cloudinary.model.Product;
import com.abdo.cloudinary.repository.ProductRepository;
import com.abdo.cloudinary.service.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class FileUploadController {

    private final FileUpload fileUpload;


    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/uploadImage")
    public ImageUrl uploadImage(@RequestParam("image")MultipartFile multipartFile) throws IOException {
        String imageURL = fileUpload.uploadFile(multipartFile);
        return new ImageUrl(imageURL);
    }

    @PostMapping("/uploadFile")
    public Product uploadFile(@RequestBody Product product){
        return productRepository.save(product);
    }


}
