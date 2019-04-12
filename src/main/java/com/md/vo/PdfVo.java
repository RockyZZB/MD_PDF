package com.md.vo;

import lombok.Data;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.Serializable;

/**
 * @author ：zb
 * @date ：Created in 2019/4/12 0012 10:48
 * @description：
 */
@Data
public class PdfVo implements Serializable {
    private CommonsMultipartFile file;

}
