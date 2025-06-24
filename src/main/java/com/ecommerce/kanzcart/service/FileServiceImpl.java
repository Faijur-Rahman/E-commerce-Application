package com.ecommerce.kanzcart.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService {
    
    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException{
        String originalFileNamee = file.getOriginalFilename();

        String randomId = UUID.randomUUID().toString();
        String fileName = randomId.concat(originalFileNamee.substring(originalFileNamee.lastIndexOf('.')));
        String filePath = path + File.separator + fileName;

        File folder = new File(path);
        if(!folder.exists()) 
                folder.mkdirs();
        
        Files.copy(file.getInputStream(), Paths.get(filePath));

        return fileName;
    } }


