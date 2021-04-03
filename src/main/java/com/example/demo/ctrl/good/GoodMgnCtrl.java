package com.example.demo.ctrl.good;

import com.example.demo.ctrl.good.request.GetGoodDetailRequest;
import com.example.demo.ctrl.good.response.DefaultWebResponse;
import com.example.demo.exception.BusinessException;
import com.example.demo.service.good.GoodMgnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("goods")
public class GoodMgnCtrl {
    @Autowired
    GoodMgnService goodMgnService;

    @PostMapping("detail")
    public DefaultWebResponse getGoodDetail(@RequestBody GetGoodDetailRequest request) throws BusinessException {
        Assert.notNull(request,"request can not be null");
        return DefaultWebResponse.Builder.success(goodMgnService.getGoodById(request.getGoodId()));
    }

    @PostMapping("list")
    public DefaultWebResponse findGood() {
        return DefaultWebResponse.Builder.success(goodMgnService.getAllGoods());
    }
}
