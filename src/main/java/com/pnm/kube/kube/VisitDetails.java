package com.pnm.kube.kube;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class VisitDetails {

    private Integer id = null;

    private Integer petId = null;

    private String date = null;

    private String description = null;
}
