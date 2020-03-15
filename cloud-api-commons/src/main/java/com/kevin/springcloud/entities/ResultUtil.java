package com.kevin.springcloud.entities;

public class ResultUtil {
    /**
     * 成功无返回数据
     * @return
     */
    public static CommonResult success() {
        CommonResult commonResult = new CommonResult();
        commonResult.setResultCode(ResultCode.SUCCESS);
        return commonResult;
    }

    /**
     * 成功带返回数据
     * @param data 响应数据
     * @return
     */
    public static CommonResult success(Object data) {
        CommonResult commonResult = new CommonResult();
        commonResult.setResultCode(ResultCode.SUCCESS);
        commonResult.setData(data);
        return commonResult;
    }

    /**
     * 自定义状态码并带返回数据
     * @param code 结果状态码
     * @param data 响应数据
     * @return
     */
    public static CommonResult success(ResultCode code, Object data) {
        CommonResult commonResult = new CommonResult();
        commonResult.setResultCode(code);
        commonResult.setData(data);
        return commonResult;
    }

    /**
     * 失败不带返回数据
     * @return
     */
    public static CommonResult failure() {
        CommonResult commonResult = new CommonResult();
        commonResult.setResultCode(ResultCode.FAILURE);
        return commonResult;
    }

    /**
     * 失败带返回数据
     * @param data 响应数据
     * @return
     */
    public static CommonResult failure(Object data) {
        CommonResult commonResult = new CommonResult();
        commonResult.setResultCode(ResultCode.FAILURE);
        commonResult.setData(data);
        return commonResult;
    }
}
