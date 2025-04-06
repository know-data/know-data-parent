/**
 * generated by Platform Generator
 *
 * @generated 2022-06-13 09:45
 */
package com.knowdata.framework.core.model.dto;

import com.knowdata.framework.core.model.base.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "公共响应对象", description = "公共响应对象") // [swagger] 作用范围: 模型类，如VO、BO
public class XResponse<T> extends BaseObject {
    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    @ApiModelProperty(
            value = "响应状态",
            example = "true",
            hidden = false
    ) // [swagger] 作用范围: 类的方法、属性上 / hidden=true 可隐藏该属性 / value = "属性说明"
    private Boolean status;

    /**
     * 返回对象
     */
    @ApiModelProperty(value = "业务数据")
    private T data;

    /**
     * 错误码
     */
    @ApiModelProperty(value = "错误码")
    private String errorCode;

    /**
     * 错误信息
     */
    @ApiModelProperty(value = "错误信息", example = "error message")
    private String errorMessage;

    public XResponse() {

    }

    public XResponse(Boolean status, T data, String errorCode, String errorMessage) {
        this.status = status;
        this.data = data;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public static XResponse create(Boolean status, Object data, String errorCode,
                                        String errorMessage) {
        return new XResponse(status, data, errorCode, errorMessage);
    }

    public static XResponse success() {
        return create(true, null, null, null);
    }

    public static <T> XResponse success(T obj) {
        return create(true, obj, null, null);
    }

    public static XResponse failure() {
        return create(false, null, null, null);
    }

    public static XResponse failure(String errorCode) {
        return create(false, null, errorCode, null);
    }

    public static XResponse failure(String errorCode, String errorMsg) {
        return create(false, null, errorCode, errorMsg);
    }

    public Boolean getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "XResponse{" +
                "status=" + status +
                ", data=" + data +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
