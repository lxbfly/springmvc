package cn.gavin.springmvc.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;
import cn.gavin.springmvc.model.UserModel;

public class CanCancelRegisterSimpleFormController extends CancellableFormController {
    public CanCancelRegisterSimpleFormController() {
        // 设置命令对象实现类
        setCommandClass(UserModel.class);
        // 设置命令对象的名字
        setCommandName("user");
    }

    // form object 表单对象，提供展示表单时的表单数据（使用commandName放入请求）
    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        UserModel user = new UserModel();
        user.setUsername("请输入用户名");
        return user;
    }

    // 提供展示表单时需要的一些其他数据
    @Override
    protected Map<String, List<String>> referenceData(HttpServletRequest request) throws Exception {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("cityList", Arrays.asList("山东", "北京", "上海"));
        return map;
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        UserModel user = (UserModel) command;
        // TODO 调用业务对象处理
        System.out.println(user);
    }

    @Override
    protected ModelAndView onCancel(Object command) throws Exception {
        UserModel user = (UserModel) command;
        // TODO 调用业务对象处理
        System.out.println(user);
        return super.onCancel(command);
    }
}
