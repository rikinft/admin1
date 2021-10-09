package com.fintuple.admin.functions.userManagement;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.Gson;
import com.fintuple.admin.common.bean.BaseResponseBean;
import static com.fintuple.admin.common.utilities.AppConstants.SUCCESS;
import static com.fintuple.admin.common.utilities.AppConstants.baseResponse;

public class GetAllInternalUsersListFunction implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent, Context context) {
        BaseResponseBean<String> responseBean = new BaseResponseBean<>();
        try {
            responseBean.setData("GetAllInternalUsersListFunction");
            responseBean.setSuccess(true);
            responseBean.setMessage(SUCCESS);
            return baseResponse.withBody(new Gson().toJson(responseBean));
        } catch (Exception e) {
            responseBean.setSuccess(false);
            responseBean.setMessage(e.getMessage());
            return baseResponse.withBody(new Gson().toJson(responseBean));
        }
    }
}
