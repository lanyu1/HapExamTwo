package com.hand.address.controllers;

import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import com.hand.address.dto.addressList;
import com.hand.address.service.IaddressListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class addressListController extends BaseController{

    @Autowired
    private IaddressListService service;


    @RequestMapping(value = "/address/list/query")
    @ResponseBody
    public ResponseData query(addressList dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/address/list/submit")
    @ResponseBody
    public ResponseData update(HttpServletRequest request,@RequestBody List<addressList> dto){
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/address/list/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<addressList> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
}