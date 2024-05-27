package com.example.lesson.form;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Data
public class InputForm {
    @NotBlank
    @Range(min = 1)
    private String id;

    @Length(min = 1,max=50)
    @NotBlank
    private String name;

    @NotBlank
    @Range(min = 0,max=Integer.MAX_VALUE)
    private String price;
}