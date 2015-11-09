package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import com.model.LoginDao;
import com.model.login;

@Controller
@RequestMapping("/")
public class MainPageController {
	private static final long serialVersionUID = -6205814293093350242L;
	private static final String CONSUMER_KEY = "hJkRbJz9ZYcu0tii1ycbnyS0a";
	private static final String CONSUMER_SECRET = "GMZclELmLdsO8ziGgZ47itMDE6HfXu8HtqspW1wpUAMDT4c7aZ";
	
	  @Autowired
	  private LoginDao loginDao;
	 
	@RequestMapping(  method = RequestMethod.GET)
	public ModelAndView initMainPage(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping( value="/verify", method = RequestMethod.POST)
	public ModelAndView verifyCredentials(@RequestParam("user") String userName,
			@RequestParam("pass") String pass,ModelAndView mv,HttpSession session) {
		mv.setViewName("logout");
		return mv;
	}
	@RequestMapping( value="/SingUp", method = RequestMethod.GET)
	public ModelAndView SingUp(ModelAndView mv,HttpSession session) {
		mv.setViewName("SingUp");
		return mv;
	}
	@RequestMapping( value="/signin", method = RequestMethod.GET)
	public void SigninServlet(HttpServletRequest request, HttpServletResponse response ,ModelAndView mv,HttpSession session) throws ServletException, IOException{
		ConfigurationBuilder builder = new ConfigurationBuilder();
    	builder.setOAuthConsumerKey(CONSUMER_KEY);
    	builder.setOAuthConsumerSecret(CONSUMER_SECRET);
    	Configuration configuration = builder.build();
    	TwitterFactory factory = new TwitterFactory(configuration);
    	
    	
    	Twitter twitter = factory.getInstance();
        request.getSession().setAttribute("twitter", twitter);
        try {
            StringBuffer callbackURL = request.getRequestURL();
            int index = callbackURL.lastIndexOf("/");
            callbackURL.replace(index, callbackURL.length(), "").append("/callback");

            RequestToken requestToken = twitter.getOAuthRequestToken(callbackURL.toString());
            request.getSession().setAttribute("requestToken", requestToken);
            response.sendRedirect(requestToken.getAuthenticationURL());
	
    } catch (TwitterException e) {
        throw new ServletException(e);
    }
}
	
	@RequestMapping( value="/callback", method = RequestMethod.GET)
	public void CallbackServlet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Twitter twitter = (Twitter) request.getSession().getAttribute("twitter");
        RequestToken requestToken = (RequestToken) request.getSession().getAttribute("requestToken");
        String verifier = request.getParameter("oauth_verifier");
        try {
            twitter.getOAuthAccessToken(requestToken, verifier);
            request.getSession().removeAttribute("requestToken");
        } catch (TwitterException e) {
            throw new ServletException(e);
        }
        response.sendRedirect(request.getContextPath() + "/");
	}
	@RequestMapping( value="/signupverification", method = RequestMethod.POST)
	public ModelAndView signupVerifyCredentials(@RequestParam("name") String name,@RequestParam("lastName") String lastName,@RequestParam("user") String userName,
			@RequestParam("pass") String pass,@RequestParam("email") String email,ModelAndView mv,HttpSession session) {
		System.out.println(userName +" "+lastName+" "+pass+" "+email+" "+name);
		login login  = new login();
		login.setLastName(lastName);
		login.setName(name);
		login.setPassword(pass);
		login.setUserName(userName);
		login.setEmail(email);
		login.setIdlogin( 5);
		loginDao.save(login);
		
//		loginRepository.save(login);
		mv.setViewName("logout");
		return mv;
	}
}
