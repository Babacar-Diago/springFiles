package com.springboot.file.springFiles.service;

import com.springboot.file.springFiles.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SpringReadFileService {

    List<User> findAll();

    boolean saveDataFromUploadFile(MultipartFile file);
}
