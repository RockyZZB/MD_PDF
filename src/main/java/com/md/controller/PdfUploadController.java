package com.md.controller;

import com.md.utils.UidUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ：zb
 * @date ：Created in 2019/4/12 0012 9:06
 * @description：
 */
@Controller
public class PdfUploadController {


    @RequestMapping(value = "/fileUpload",method = RequestMethod.POST)
    @ApiOperation(value = "upload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile file)throws IOException {
        String path = System.getProperty("user.dir");
        path=path.replaceAll("\\\\","\\/");
        path=path+"/src/main/resources/pdf/"+UidUtil.getUid()+file.getOriginalFilename();
        String path2 = file.getOriginalFilename();
        File newFile=new File(path);
        file.transferTo(newFile);
        return "success";
    }

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String getHtml(){
        return "pdfjs/web/viewer.html";
    }
}