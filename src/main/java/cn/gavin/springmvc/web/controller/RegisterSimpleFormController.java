package cn.gavin.springmvc.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.mvc.SimpleFormController;
import cn.gavin.springmvc.model.UserModel;

public class RegisterSimpleFormController extends SimpleFormController {

    public RegisterSimpleFormController() {
        setCommandClass(UserModel.class);
        setCommandName("user");
    }

    @Override
    protected Map referenceData(HttpServletRequest request) throws Exception {
        // return super.referenceData(request);
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("cityList", Arrays.asList("Shandong", "Beijing", "Shuanghai"));
        return map;
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        // super.doSubmitAction(command);
        UserModel user = (UserModel) command;
        System.out.println(user);
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        // return super.formBackingObject(request);s
        UserModel user = new UserModel();
        user.setUsername("please input username...");
        return user;
    }

}
