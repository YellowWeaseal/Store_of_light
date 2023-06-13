package com.example.server.controller.website;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/images")
public class ImageController {

    @GetMapping(value ="/{imgHref}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getImageWithMediaType(@PathVariable("imgHref") String imgHref) throws IOException {
        InputStream in = getClass()
                .getResourceAsStream("/images/" + imgHref);
        if(in == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return IOUtils.toByteArray(in);
    }
}
