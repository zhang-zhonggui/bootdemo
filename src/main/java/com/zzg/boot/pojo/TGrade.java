package com.zzg.boot.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class TGrade implements Serializable {
    private Integer id;

    private String gname;
}