package com.zl.bifrost.common.response.menu;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class AdminMenuData {
    private Long id;
    private String authName;
    private String path;
    private List<AdminMenuData> children;
}
