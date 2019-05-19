package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.PictureUploadResponse;
import org.springframework.web.multipart.MultipartFile;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 8:43
 */
public interface FileService {
    
    PictureUploadResponse uplodaFile(MultipartFile file, String carId);
}
