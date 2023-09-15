package com.ahmetinci.locationweb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveEmployeeDTO {

    private Long id;
    private String code;
    private String name;
    private String type;
}
