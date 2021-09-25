import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChuongTrinh {

	public static void main(String[] args) {
		
		Frame fr = new Frame("Tong hai so A B");
		fr.setBounds(0, 0, 600, 400);
		fr.setLayout(new FlowLayout());
		
		//Gan vao F
		Label lblA = new Label("A=");
		Label lblB = new Label("B=");
		Label lblKQ = new Label("KQ=");
		
		TextField txtA = new TextField();
		TextField txtB = new TextField();
		TextField txtKQ = new TextField();
		
		Button btnCong = new Button("Tinh tong");
		
		{
		fr.add(lblA);		fr.add(txtA);
		fr.add(lblB);		fr.add(txtB);
		fr.add(btnCong);
		fr.add(lblKQ);		fr.add(txtKQ);
	};
		
		//Xu li nut Tinh tong duoc nhan
		//Tao bo lang nghe va xu li su kien
		ActionListener bolangnghe = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent	e)	{
					//Code xu li o day
					//1, Lay A,B
					String strA = txtA.getText();
					String strB = txtB.getText();
					
					//Doi sang con so de tinh toan
					int a = Integer.parseInt(strA);
					int b = Integer.parseInt(strB);
					//Tinh tong
					int c = a+b;
					
					//Xuat ket qua ra dieu kien
					txtKQ.setText(String.valueOf(c) );
			}
		};
		
		btnCong.addActionListener(bolangnghe);
		
		
		//Bo lang nghe su kien cua so
		WindowAdapter a = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent	e) {
				System.exit(0);
			}
		};
		fr.addWindowListener(a); 
		
		fr.setVisible(true);
}
}