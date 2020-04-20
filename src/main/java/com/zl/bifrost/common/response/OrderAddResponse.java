package com.zl.bifrost.common.response;

import com.zl.bifrost.common.request.OrderVO;
import lombok.Data;

import java.util.List;

/**
 * Created by Vongola on 2019/3/3.
 */
@Data
public class OrderAddResponse extends BaseResponse {
    private OrderVO order;
}
