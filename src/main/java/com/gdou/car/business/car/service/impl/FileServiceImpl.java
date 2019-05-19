package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarConstants;
import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.PictureUploadResponse;
import com.gdou.car.business.car.dal.persistence.CarInfoMapper;
import com.gdou.car.business.car.service.FileService;
import com.gdou.car.business.car.utils.IDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 8:44
 */
@Service
public class FileServiceImpl implements FileService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarInfoMapper carInfoMapper;
    
    @Override
    public PictureUploadResponse uplodaFile(MultipartFile file, String carId) {
        Log.info("upload file request");
        
        PictureUploadResponse response = new PictureUploadResponse();
        try {
            if (file.isEmpty()) {
                response.setCode(CarResponseCodeEnum.SYS_PARAM_NOT_RIGHT.getCode());
                response.setMsg("文件名为空");
                return response;
            }
            
            // 获取文件名
            String fileName = file.getOriginalFilename();
            System.out.println("上传的文件名为：" + fileName);
            
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            System.out.println("上传的后缀名为：" + suffixName);
            
            // 生成文件名称
            String genFileName = IDUtils.genImageName() + suffixName;
            
            File dest = new File(CarConstants.filePath + genFileName);
            
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            
            
            file.transferTo(dest);
            carInfoMapper.updatePictureUrl(carId, CarConstants.fileUrl + genFileName);
            
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
            
            return response;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
        response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        return response;
    }
}
