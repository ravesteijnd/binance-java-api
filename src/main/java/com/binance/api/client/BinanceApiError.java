package com.binance.api.client;

import com.binance.api.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;

/**
 * Binance API error object.
 */
public class BinanceApiError {

  /**
   * Error code.
   */
  private int code;

  /**
   * Error message.
   */
  private String msg;

  private Map<String, List<String>> responseHeaders;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Map<String, List<String>> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("code", code)
        .append("msg", msg)
        .toString();
  }
}
