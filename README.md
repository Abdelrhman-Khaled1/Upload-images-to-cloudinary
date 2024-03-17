# I have a problem trying to send a product with an image to my backend.

### So, using cloudinary, I now have the ability to send it to that cloud service, get url reference to my image, and then send the image URL within my JSON object to the backend.
</br>

## This is our api to send an image  
![upload image](https://github.com/Abdelrhman-Khaled1/Upload-images-to-cloudinary/assets/73125122/2bbc8994-c321-42c1-ae16-b10d7b031676)

</br>

You expect a json object like that

```
{
    "url": "http://res.cloudinary.com/dnyddowhv/image/upload/v3127/Folder/vw2r-b556082d7648.png"
}
```

## And this is our api to send an product
![upload product](https://github.com/Abdelrhman-Khaled1/Upload-images-to-cloudinary/assets/73125122/5bf022c7-a9c0-4ae1-a490-971ca471444d)

</br>

You expect a json object like that

```
{
    "id": 1,
    "title": "Product title",
    "content": "content about the product",
    "url": "http://res.cloudinary.com/dnyddowhv/image/upload/v1249/Folder/420d08501066f1.png"
}
```

</br>
</br>


### We have now finished. I'll be happy to see you again!
