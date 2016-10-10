package com.atwjsw.verification.servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ImageServlet.doGet");
		
		//画一张68*22的图片上
		BufferedImage bi = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		Color c = new Color(200, 150, 255);
		g.setColor(c);
		g.fillRect(0, 0, 68, 22);
		
		//随机产生4个字符,依次画在上图里
		char[] ch ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		Random r = new Random();
		int len = ch.length, index;
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<4; i++) {
			index = r.nextInt(len);
			g.setColor(new Color(r.nextInt(88), r.nextInt(188),r.nextInt(255)));
			g.drawString(ch[index]+"", (i*15)+3, 18);
			sb.append(ch[index]);
		}
		
		//4个字符存入session
		req.getSession().setAttribute("piCode", sb.toString());
		
		//输出图片到客户端
		ImageIO.write(bi, "JPG", resp.getOutputStream());		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}
