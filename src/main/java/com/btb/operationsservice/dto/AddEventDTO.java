package com.btb.operationsservice.dto;

import com.btb.operationsservice.common.validation.annotations.NotNullOrEmpty;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddEventDTO {

    @NotNullOrEmpty
    private Long userId;

    @Max(3)
    @NotNullOrEmpty
    private String eventType;

    @NotNullOrEmpty
    private String description;

}
