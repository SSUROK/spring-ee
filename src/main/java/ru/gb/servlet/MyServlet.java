package ru.gb.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.gb.entity.Product;
import ru.gb.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "MyServlet", urlPatterns = "/products")
public class MyServlet extends HttpServlet {

    private static Logger log = LoggerFactory.getLogger(MyServlet.class);
    private final ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(productService.createNewProduct(i+1));
        }
        req.setAttribute("list", list);
        getServletContext().getRequestDispatcher("/product.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
