package com.kg.emailclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/Contact")
public class ContactController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

List<Contact> contactListuser1 = new ArrayList<Contact>();

// List<Contact> contactListuser2 = new ArrayList<Contact>();

// Contact contact = new Contact(1, "email", "phone");
// Contact contact = new Contact(2, "email22", "phone22");
// Contact contact = new Contact(2, "email22", "phone22");
contactListuser1.add(new Contact(1, "email1", "phone1"));
contactListuser1.add(new Contact(2, "email2", "phone2"));
contactListuser1.add(new Contact(3, "email22", "phone22"));


// contactListuser2.add(contact2);
// contactListuser2.add(contact22);

req.setAttribute("contactListuser1", contactListuser1);
// req.setAttribute("contactListuser2", contactListuser1);
// req.setAttribute("contactListuser1", contactListuser1);

RequestDispatcher view = req.getRequestDispatcher("contact.jsp");
view.forward(req, resp);
// req.setAttribute("contactListuser1", contactListuser1);
// RequestDispatcher view = req.getRequestDispatcher("contact.jsp");
// view.forward(req, resp);
// protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//     String forward = "";
    String action = req.getParameter("action");
   System.out.println(action);
   try {
        switch (action) {
        case "delete":
            deleteUser(req, resp);
            break;

//         case "edit":
//             // System.out.println("case= edit");
//             showEditForm(req, resp);
//             break;

//         case "insert":
//             showAddForm(req, resp);
//             break;

//         case "saveorupdate":
//             saveorupdateUser(req, resp);
//             break;

        // default:
//             listUser(req, resp);
//             break;
        }
    } catch (ServletException | IOException e) {

        e.printStackTrace();
    }
// }
private void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int userid = Integer.parseInt(req.getParameter("userid"));
    for (Contact user : contactListuser1) {
        if (user.getUserid() == userid) {

            System.out.println(user);
            contactListuser1.remove(contactListuser1.indexOf(user));
            break;
        }

    }

    req.setAttribute("contactListuser1", contactListuser1);
    RequestDispatcher v = req.getRequestDispatcher("contact.jsp");
    view.forward(req, resp);
}
    }

	private void deleteUser(HttpServletRequest req, HttpServletResponse resp) {
	}
}