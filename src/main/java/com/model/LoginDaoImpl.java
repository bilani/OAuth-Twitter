//package com.dao;
//
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.doman.login;
//
//@Repository
//public class LoginDaoImpl implements LoginDao{
//	
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public LoginDaoImpl(){
//    	
//    }
//    public LoginDaoImpl(SessionFactory sessionFactory){
//    	this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    @Transactional
//    public List<login> list() {
//        @SuppressWarnings("unchecked")
//        List<login> listLogin = (List<login>) sessionFactory.getCurrentSession()
//                .createCriteria(login.class)
//                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
// 
//        return listLogin;
//    }
//    
//    @Override
//    @Transactional
//    public void saveOrUpdate(login login) {
//        sessionFactory.getCurrentSession().saveOrUpdate(login);
//    }
//    @Override
//    @Transactional
//    public void delete(int id) {
//    	login userToDelete = new login();
//        userToDelete.setIdlogin(id);
//        sessionFactory.getCurrentSession().delete(userToDelete);
//    }
// 
//    @Override
//    @Transactional
//    public login get(int id) {
//        String hql = "from User where id=" + id;
//        Query query = sessionFactory.getCurrentSession().createQuery(hql);
//         
//        @SuppressWarnings("unchecked")
//        List<login> listLogin = (List<login>) query.list();
//         
//        if (listLogin != null && !listLogin.isEmpty()) {
//            return listLogin.get(0);
//        }
//         
//        return null;
//    }
//}
//
