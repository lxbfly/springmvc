package cn.gavin.springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import cn.gavin.springmvc.model.UserModel;
import cn.gavin.springmvc.web.service.UserService;

public class UserController extends MultiActionController {

    private UserService userService;
    private String createView;
    private String updateView;
    private String deleteView;
    private String listView;
    private String redirectToListView;

    public String create(HttpServletRequest request, HttpServletResponse response, UserModel user) {
        if ("GET".equals(request.getMethod())) {
            // 如果是get请求 我们转向 新增页面
            return getCreateView();
        }
        userService.create(user);
        // 直接重定向到列表页面
        return getRedirectToListView();
    }

    public ModelAndView update(HttpServletRequest request, HttpServletResponse response, UserModel user) {
        if ("GET".equals(request.getMethod())) {
            // 如果是get请求 我们转向更新页面
            ModelAndView mv = new ModelAndView();
            // 查询要更新的数据
            mv.addObject("command", userService.get(user.getUsername()));
            mv.setViewName(getUpdateView());
            return mv;
        }
        userService.update(user);
        // 直接重定向到列表页面
        return new ModelAndView(getRedirectToListView());
    }

    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response, UserModel user) {
        if ("GET".equals(request.getMethod())) {
            // 如果是get请求 我们转向删除页面
            ModelAndView mv = new ModelAndView();
            // 查询要删除的数据
            mv.addObject("command", userService.get(user.getUsername()));
            mv.setViewName(getDeleteView());
            return mv;
        }
        userService.delete(user);
        // 直接重定向到列表页面
        return new ModelAndView(getRedirectToListView());
    }

    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", userService.list());
        mv.setViewName(getListView());
        return mv;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getCreateView() {
        return createView;
    }

    public void setCreateView(String createView) {
        this.createView = createView;
    }

    public String getUpdateView() {
        return updateView;
    }

    public void setUpdateView(String updateView) {
        this.updateView = updateView;
    }

    public String getDeleteView() {
        return deleteView;
    }

    public void setDeleteView(String deleteView) {
        this.deleteView = deleteView;
    }

    public String getListView() {
        return listView;
    }

    public void setListView(String listView) {
        this.listView = listView;
    }

    public String getRedirectToListView() {
        return redirectToListView;
    }

    public void setRedirectToListView(String redirectToListView) {
        this.redirectToListView = redirectToListView;
    }
}
