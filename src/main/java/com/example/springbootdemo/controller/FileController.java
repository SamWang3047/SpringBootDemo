package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

@RestController
public class FileController {

    @PostMapping("/upload")
    //@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        //获取文件大小
        System.out.println("File size: " + photo.getSize());
        //获取文件类型
        System.out.println(photo.getContentType());
        //获取文件原始名称
        System.out.println(photo.getOriginalFilename());

        //动态获取云服务器文件目录位置
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        saveFile(photo, path);
        return "Upload success";
    }

    public void saveFile(MultipartFile photo, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(path + "/upload" + photo.getOriginalFilename());
        photo.transferTo(file);
    }
}