package cn.gavin.springmvc.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import cn.gavin.springmvc.model.UserModel;

public class InfoFillWizardFormController extends AbstractWizardFormController {

    public InfoFillWizardFormController() {
        setCommandClass(UserModel.class);
        setCommandName("user");
    }

    @Override
    protected Map<String, List<String>> referenceData(HttpServletRequest request, int page) throws Exception {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        if (page == 1) { // 如果是填写学校信息页 需要学校类型信息
            map.put("schoolTypeList", Arrays.asList("高中", "中专", "大学"));
        }
        if (page == 2) {// 如果是填写工作信息页 需要工作城市信息
            map.put("cityList", Arrays.asList("济南", "北京", "上海"));
        }
        return map;
    }

    @Override
    protected void validatePage(Object command, Errors errors, int page) {
        // 提供每一页数据的验证处理方法
        // super.validatePage(command, errors, page);
    }

    @Override
    protected void postProcessPage(HttpServletRequest request, Object command, Errors errors, int page) throws Exception {
        // 提供给每一页完成时的后处理方法
        // super.postProcessPage(request, command, errors, page);
    }

    @Override
    protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
                                         BindException errors) throws Exception {
        // 取消后的处理方法
        System.out.println(command);
        return new ModelAndView("redirect:/cancel");
    }

    @Override
    protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
                                         BindException errors) throws Exception {
        // 成功后的处理方法
        System.out.println(command);
        return new ModelAndView("redirect:/success");
    }

}
