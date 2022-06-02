package com.sync.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoticeDTO {

    private Integer nt_id;
    private String title;
    private String content;
    private String adm_id;
    private String username;
    private int delflag;

    private LocalDateTime regDate;
    private LocalDateTime updateDate;

    private int replyCount;

    private List<UploadResultDTO> uploads = new ArrayList<>();

    //mainImage의 썸네일 링크
    private String mainImage;

    public String getMain(){
        if(mainImage == null){
            return null;
        }
        int idx = mainImage.indexOf("s_");
        String first = mainImage.substring(0, idx);
        String second = mainImage.substring(idx+2);

        return first+second;
    }

}
