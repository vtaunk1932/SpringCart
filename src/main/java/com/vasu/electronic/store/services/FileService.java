package com.vasu.electronic.store.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {

    // Upload file and return its name
    String uploadFile(MultipartFile file, String path) throws IOException;

    // Get file as input stream
    InputStream getResource(String path, String name) throws FileNotFoundException;

    // Delete file and return true if deleted
}
