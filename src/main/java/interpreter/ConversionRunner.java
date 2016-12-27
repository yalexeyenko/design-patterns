package interpreter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConversionRunner {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		String questionAsked = JOptionPane.showInputDialog(frame, "What is your question?");
		
		ConversionContext context = new ConversionContext(questionAsked);
		String convertFrom = context.getConversionFrom();
		String convertTo = context.getConversionTo();
		Double quantity = context.getQuantity();
		
		try {
			Class clazz = Class.forName("interpreter." + convertFrom);
			Constructor constr = clazz.getConstructor();
			Object objectToConvert = (Expression) constr.newInstance();
			
			Class[] methodParams = new Class[]{Double.TYPE};
			Method method = clazz.getMethod(convertTo, methodParams);
			
			Object[] params = new Object[]{quantity};
			String quantityRes = (String) method.invoke(objectToConvert, params);
			
			String convUnswer = context.getConversionREsponse() + quantityRes + " " + convertTo;
			
			JOptionPane.showMessageDialog(null, convUnswer);
			frame.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
