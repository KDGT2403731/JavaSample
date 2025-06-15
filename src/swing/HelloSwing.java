package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloSwing {
    public static void main(String[] args) {
    	// フレーム作成
    	JFrame frame = new JFrame("Swingの例");
    	// ラベル作成（演習1：文字を変更）
    	JLabel label = new JLabel("ようこそJavaの世界へ", JLabel.CENTER);
    	// フォントサイズを大きく設定（応用1）
    	label.setFont(new Font("Serif", Font.BOLD, 20));
    	// ボタン作成（応用2）
    	JButton button = new JButton("ここをクリック");
    	// ボタン押下イベントの設定
    	button.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    	label.setText("ボタンが押されました");
    	}
    	});
    	// パネルにラベルとボタンを追加（縦に並べる）
    	JPanel panel = new JPanel();
    	panel.setLayout(new BorderLayout());
    	panel.add(label, BorderLayout.CENTER);
    	panel.add(button, BorderLayout.SOUTH);
    	// フレームにパネルを追加
    	frame.add(panel);
    	// フレームサイズ設定（演習2：400x200）
    	frame.setSize(400, 200);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}