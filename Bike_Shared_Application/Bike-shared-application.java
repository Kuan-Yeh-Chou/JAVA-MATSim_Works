import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.MalformedURLException;
import java.net.URL;
public class BonusProjectB01501022 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		    	//First we divide into 8 districts 
		String s=JOptionPane.showInputDialog(null,"Enter what district that you want to find?\n 1=�j�w��     5=�U�ذ�  \n 2=�H�q��     6=������ \n 3=�Q�s��     7=���s��   \n 4=�n���     8=��s��");
		//Then after choosing the district you would be ask to choose the location where U-BIKE  are
		int i=Integer.parseInt(s);
	    //After you choose one of the location it will informed you of where the U-BIKE station that you are, how the place nearby looks like ,nearby map that can clearly realize where you are  and what constructions are adjacent to the U-BIKE stations .
		if(i==1){
			String s1=JOptionPane.showInputDialog(null,"You choose �j�w��  and then choose which section that you want?\n 1=���B��ޤj�ӯ�            5=�H�q�ذ���f               9=���s�R����f                      13=�򶩪������f\n" +
					" 2=����s�͸��f                 6=���B���i�p��              10=�O�j��T�j��                    14=���B�F����(4���X�f)\n 3=�O�W�v�d�j��(�Ϯ��]) 7=���B���]��(2���X�f) 11=���B�����s��(3���X�f)  15=�s���s�� \n 4=�O�_���߹Ϯ��](�`�]) 8=�s�ͩM�����f               12=�x�W��ޤj��                    16=���R��|");
			int i1=Integer.parseInt(s1);		
		if(i1==1){
		  
			ShowInformation("http://ts4.mm.bing.net/th?id=H.4701169191289795&pid=15.1" , "http://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Technology_Building_Station_20091102a.jpg/250px-Technology_Building_Station_20091102a.jpg", "��ޤj�ӯ���a��T" , " ��m:�x�_���j�w�ϴ_���n��2�q235��" ,"�P�g:" +
					"��ߥx�_�Ш|�j�� ��_�Фj��p ��ߥx�W�j�Ǵ_���n���ժ� �x�_������F�k�| ���\��v ��ޤj�ӡ]��a��ǩe���|�B�굦�|�^");
		}
		if(i1==2){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4996409493359269&pid=15.1","http://ts2.mm.bing.net/th?id=H.4844702685135409&pid=15.1" , " ����s�͸��f��a��T" , "��m:������P�s�ͫn����e�����f" ," �P��:�Ѳ��а|�]22���^"+
                  "�x�_���B�лx���B�x�q�j�ӯ�  �ذ갪�[�D��������q  ���ȤH�O�o�i���� ��ߥx�W�j��  �x�_�˧L���n�Ϥ���");
		}
		if(i1==3){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4716210151295508&pid=15.1","http://ts3.mm.bing.net/th?id=H.4940330103539490&pid=15.1"," �O�W�v�d�j��(�Ϯ��])��a��T","��m:�O�_���M���F��1�q129�� "," �P��:�v�j�]�� ");
		}
		if(i1==4){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4584174285751230&pid=15.1","http://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Taipei_Public_Library_%28Main_Library%29.JPG/230px-Taipei_Public_Library_%28Main_Library%29.JPG","�O�_���߹Ϯ��](�`�])��a��T"," ��m:�x�_���j�w�ϫذ�n���G�q125��","�g��:�j�w�˪L����");
		}
		if(i1==5){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.5023089822597821&pid=15.1","http://ts2.mm.bing.net/th?id=H.4760143324251297&pid=15.1"," �H�q�ذ���f��a��T"," ��m:�H�q���P�ذ�n����e�����f"," �P��:��߮v�d�j�Ǫ��ݰ��Ť���  ����b�x��|(AIT) ");
		}
		if(i1==6){
			ShowInformation("http://ts4.mm.bing.net/th?id=H.5028458543975419&pid=15.1","http://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Liuzhangli_Station_Birdview.jpg/300px-Liuzhangli_Station_Birdview.jpg"," ���B���i�p�� ��a��T"," ��m:�O�_���j�w�ϩM���F��3�q168��"," �P��:�k�ȳ��x�_���լd�B"+
                    "  ��x�֧Q�`�B   ���F���~����");
		}
		if(i1==7){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.5032654708802213&pid=15.1","http://ts3.mm.bing.net/th?id=H.5021676785960890&pid=15.1"," ���B���]��(2���X�f)��a��T"," ��m:ù���ָ�4�q�a��s��"," �P��:��ߥx�W�j��   ���]�]���Ӱ�");
		}
		if(i1==8){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4583169249247881&pid=15.1","http://ts3.mm.bing.net/th?id=H.5059455281596918&pid=15.1"," �s�ͩM�����f��a��T"," ��m:�s�ͫn���P�M���F������e�f"," �P��:�j�w��F����   �j�w�˪L����");
		}
		if(i1==9){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4949547104207489&pid=15.1","http://ts3.mm.bing.net/th?id=H.4650827854252158&pid=15.1"," ���s�R����f��a��T"," ��m:���s�n���P�R��F������e�f"," �P��:�ñd��Ӱ�   ����������  ���ذ�p");
		}
		if(i1==10){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4640584388905530&pid=15.1","http://ts4.mm.bing.net/th?id=H.4874058785292687&pid=15.1"," �O�j��T�j�ӷ�a��T"," ��m:������G�q(�O�j�~�y�ǰ|�~)"," �P��:��ߥx�W�j�Ƿs����|");
		}
		if(i1==11){
			ShowInformation("http://ts4.mm.bing.net/th?id=H.4528893756638767&pid=15.1","http://ts3.mm.bing.net/th?id=H.4837933807895054&pid=15.1"," ���B�����s��(3���X�f)��a��T"," ��m: �x�_���j�w�Ϸs�ͫn���@�q67�� "," �P��:�x�_��ޤj��   ���ذӳ�   ���s�k��");
		}
		if(i1==12){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.5005295758409949&pid=15.1","http://ts2.mm.bing.net/th?id=H.4741340015756177&pid=15.1"," �x�W��ޤj�Ƿ�a��T"," ��m: �O�_���j�w�ϰ򶩸� 4 �q 43 ��"," �P��:��ߥx�W�j��  ���]��p  ���]�]���Ӱ�");
		}
		if(i1==13){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4795314864849416&pid=15.1","http://ts2.mm.bing.net/th?id=H.4686458932758473&pid=15.1"," �򶩪������f��a��T"," ��m:�򶩸��P����������e���f"," �P��:��ߥx�W�j��  �x�W��ޤj��  ����BOT");
		}
		if(i1==14){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4786819399289122&pid=15.1","http://ts1.mm.bing.net/th?id=H.4613195387045320&pid=15.1"," ���B�F����(4���X�f)��a��T"," ��m:�R����]�H�q���G�q148�Ѥf)"," �P��:�ñd��Ӱ�   �F������    ���ضl�F�`���q");
		}
		if(i1==15){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4636813395954321&pid=15.1","http://ts4.mm.bing.net/th?id=H.4937181869572535&pid=15.1"," �s���s����a��T"," ��m:�x�_���j�w�ϫذ�n���G�q269��"," �P��:�s���ꤤ  �ѥЧ��E  �j�w�˪L���� ");
		}
		if(i1==16){
			ShowInformation("http://ts4.mm.bing.net/th?id=H.4637281550599407&pid=15.1","http://ts4.mm.bing.net/th?id=H.4554062262370795&pid=15.1"," ���R��|��a��T"," ��m:�O�_���j�w�Ϥ��R���|�q10��"," �P��:�ֵؤj���� ");
		}
				}
   if(i==2){
	   String s2=JOptionPane.showInputDialog(null,"You choose �H�q��  and then choose where the that you want?\n 1=���B���F����(3���X�f)-1   5=���B���F����(3���X�f)-2   9=���B��������]��      13=�x�_���F��               17=�æN�Q�H���f\n" +
					" 2=�����s��                                 6=�����ꤤ                                 10=�@�T�G�]                      14=�H�q�s��(�x�_101) 18=���`����\n 3=�@�T�T�]                                 7=�Q�w��                                     11=�x�_���a�`���ܤ��� 15=�T�i�p \n 4=�O�_��Ǥj��                        8=�ּw����                                 12=�Q�s�a��                       16=���j����\n");
	   int i2=Integer.parseInt(s2);	
	   if(i2==1){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4930541875366689&pid=15.1","http://ts4.mm.bing.net/th?id=H.4760602947551583&pid=15.1"," ���B���F����(3���X�f)-1��a��T"," ��m:�����F��/�Q����(�F�n��) "," �P��:�x�_���F��  �x�_��B��  �Τ@����ʳf �s���T�V");  
	   }
	   if(i2==2){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4988455203701316&pid=15.1","http://ts4.mm.bing.net/th?id=H.4727780804726079&pid=15.1"," �����s����a��T"," ��m:������/�Q�ظ�(��_��)"," �P��:�g���j����   �x�_�@�T����");  
	   }
	   if(i2==3){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4746846165928542&pid=15.","http://ts3.mm.bing.net/th?id=H.5001511932789906&pid=15.1"," �@�T�T�] ��a��T"," ��m:������/�Q�ظ�(�F�n��) "," �P��:�x�_�@�T����  �g���j����    ");  
	   }
	   if(i2==4){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.5030258150998388&pid=15.1","http://ts3.mm.bing.net/th?id=H.4912009092204778&pid=15.1"," �O�_��Ǥj�Ƿ�a��T"," ��m:�x�_���H�q�ϧd����220��59��"," �P��:�x�_��Ǥj�Ǫ��]��|");  
	   }
	   if(i2==5){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4930541875366689&pid=15.1","http://ts4.mm.bing.net/th?id=H.4760602947551583&pid=15.1"," ���B���F����(3���X�f)-2 ��a��T"," ��m:�����F��/�Q����(�F�n��)"," �P��:�x�_���F��  �x�_��B��  �Τ@����ʳf �s���T�V");  
	   }
	   if(i2==6){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4699262195664016&pid=15.1","http://ts3.mm.bing.net/th?id=H.4858455187063918&pid=15.1"," �����ꤤ��a��T"," ��m:�Q����/�Q����95��(�F�n��) "," �P��:�Q�ؼs������  ���عq�H");  
	   }
	   if(i2==7){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4699528509196824&pid=15.1","http://ts2.mm.bing.net/th?id=H.4927934814751509&pid=15.1"," �Q�w����a��T"," ��m: �x�_���H�q�ϪQ�w��300�� "," �P��: ��L����  �ìK����");  
	   }
	   if(i2==8){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4656729152946824&pid=15.1","http://ts1.mm.bing.net/th?id=H.4725315477635736&pid=15.1"," �ּw�����a��T"," ��m:�j�D��/�ּw����f�_�谼"," �P��:�񤽰ꤤ  �ּw��p");  
	   }
	   if(i2==9){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4878353711893337&pid=15.1","http://ts2.mm.bing.net/th?id=H.4714487882907789&pid=15.1"," ���B��������]����a��T"," ��m:�����F���|�q�P���_�n������e�f"," �P��:��������]  ���_��p");  
	   }
	   if(i2==10){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4893892945313930&pid=15.1","http://ts2.mm.bing.net/th?id=H.4634335212669201&pid=15.1"," �@�T�G�]��a��T"," ��m:����/�Q�G��(�F�_��)"," �P��:�x�_�@�T����  �g���j����  �H�q�¨q �s���T�V");  
	   }
	   if(i2==11){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4551210415229165&pid=15.1","http://ts2.mm.bing.net/th?id=H.4929515374839837&pid=15.1"," �x�_���a�`���ܤ��߷�a��T"," ��m: �x�_���H�q�ϲ��q��391��11��2��  "," �P��:�H�q�ꤤ");  
	   }
	   if(i2==12){
		   ShowInformation("http://ts4.mm.bing.net/th?id=H.4645119860277843&pid=15.1","http://ts1.mm.bing.net/th?id=H.4645119860277844&pid=15.1"," �Q�s�a�ӷ�a��T"," ��m:�L�f��/�ּw��(�n�F��)"," �P��:�Q�s�a��");  
	   }
	   if(i2==13){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.5010595797667370&pid=15.1","http://ts3.mm.bing.net/th?id=H.4673694257776970&pid=15.1"," �x�_���F����a��T"," ��m: �x�_���F���F��(�Q����)  "," �P��:�x�_���F��  �x�_��B��  �Τ@����ʳf �s���T�V");  
	   }
	   if(i2==14){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.5010595797667370&pid=15.1","http://ts3.mm.bing.net/th?id=H.4671430828230690&pid=15.1"," �H�q�s��(�x�_101)��a��T"," ��m:�Q����/�H�q��(�F�_��) "," �P��:�x�_101  �ì��ì�  �s���T�V  �¨q�v��");  
	   }
	   if(i2==15){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4715278144636541&pid=15.1","http://ts2.mm.bing.net/th?id=H.5026169332434549&pid=15.1"," �T�i�p��a��T"," ��m:���_�n��/�򶩸��@�q364��"," �P��:�����");  
	   }
	   if(i2==16){
		   ShowInformation("http://ts4.mm.bing.net/th?id=H.5064549110908055&pid=15.1","http://ts1.mm.bing.net/th?id=H.4676473127371332&pid=15.1"," ���j�����a��T"," ��m:�Q����153��17���ﭱ"," �P��:�T�p����  �H�q�ꤤ  �������Ŷ�");  
	   }
	   if(i2==17){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4769626668009469&pid=15.1","http://ts3.mm.bing.net/th?id=H.4955190717582322&pid=15.1"," �æN�Q�H���f��a��T"," ��m:�Q�H��/�æN���n�谼�H��D"," �P��:���`����");  
	   }
	   if(i2==18){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4769626668009469&pid=15.1","http://ts3.mm.bing.net/th?id=H.5021672460518290&pid=15.1"," ���`�����a��T"," ��m: �Q����/��L��30�Ѥf(��n��) "," �P��:�Q�s������   �Ǫe�]��");  
	   }
   }
   if(i==3){
	   String s3=JOptionPane.showInputDialog(null,"You choose �Q�s��  and then choose which section that you want?\n1=�Ǫe�]��          5=���ͥ��_���f \n 2=�����]             6=���ʹ��Ƹ��f\n 3=�Q�s����         7=���[����   \n 4=���v�B�ʤ��� 8=�O�_�Ю|��");
	   int i3=Integer.parseInt(s3);	
	   if(i3==1){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4838990379746857&pid=15.1","http://ts2.mm.bing.net/th?id=H.4756621508018849&pid=15.1"," �Ǫe�]����a��T"," ��m: �K�w��/�Q�H��(��n��) "," �P��:�Ǫe�]��   �����j�D  �Q�s������");  
		      }
	   if(i3==2){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.5038139445805105&pid=15.1","http://ts1.mm.bing.net/th?id=H.4932861188048232&pid=15.1"," �����]��a��T"," ��m:�K�w���T�q25���e"," �P��:�x�_������|��");  
	      }
	   if(i3==3){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4781686912648772&pid=15.1","http://ts4.mm.bing.net/th?id=H.4546726465373115&pid=15.1"," �Q�s������a��T"," ��m: �Q�s������X�f�~�ۦ樮�椺 "," �P��:�Ǫe�]��  �����j�D ");  
	      }
	   if(i3==4){
		   ShowInformation("http://ts4.mm.bing.net/th?id=H.4674626261681151&pid=15.1","http://ts3.mm.bing.net/th?id=H.5060799667963838&pid=15.1"," ���v�B�ʤ����a��T"," ��m: ���v�F���|�q/�s�����e�f "," �P��:�Q�s�ŭx����  �������� ");  
	      }
	   if(i3==5){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4959640311562790&pid=15.1","http://ts4.mm.bing.net/th?id=H.4692222751934235&pid=15.1"," ���ͥ��_���f��a��T"," ��m:���_�_��/���ͪF��(��_��)"," �P��:���ͤ���  ���_���� ");  
	      }
	   if(i3==6){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4959640311562790&pid=15.1","http://ts4.mm.bing.net/th?id=H.4697441111313171&pid=15.1"," ���ʹ��Ƹ��f��a��T"," ��m:���ƥ��͸��f��������"," �P��:���s�ꤤ");  
	      }
	   if(i3==7){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4777658261045417&pid=15.1","http://ts4.mm.bing.net/th?id=H.4692931438184803&pid=15.1"," ���[������a��T"," ��m: �K�w���|�q91��(���[����)�� "," �P��:�ʵث�  �����j�D");  
	      }
	   if(i3==8){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.5040634769900581&pid=15.1","http://ts2.mm.bing.net/th?id=H.4654139302284681&pid=15.1"," �O�_�Ю|����a��T"," ��m: ���ƥ_��3�� "," �P��:�x�_������|��  �x��  ���ư�p");  
	      }
   }
	if(i==4){
		 String s4=JOptionPane.showInputDialog(null,"You choose �n���  and then choose which section that you want?\n1=�F�s��p                                          4=���B������(1���X�f)7=���B�n��i���]��(5���X�f)10=�n��@�T����\n2=�ɦ�����                                          5=���㤽��                      8=���B��s��(1���X�f)         11=�ⶳ����\n3=���B�n��n���ϯ�(2���X�f)  6=�n���p                      9=�n�䨮��");
		 int i4=Integer.parseInt(s4);
		 if(i4==1){
			    ShowInformation("http://ts4.mm.bing.net/th?id=H.4757128311408447&pid=15.1","http://ts2.mm.bing.net/th?id=H.4669382151243617&pid=15.1"," �F�s��p��a��T"," ��m: �F�s��p����(�F����62���e)"," �P��:�F�s��p ���F�j�D");
			 }
		 if(i4==2){
				ShowInformation("http://ts4.mm.bing.net/th?id=H.4936932798169987&pid=15.1","http://ts3.mm.bing.net/th?id=H.4908586001565714&pid=15.1"," �ɦ������a��T"," ��m:�ɦ���247���e"," �P��:���w�ꤤ �ɦ�����  ��M��¾");
			 }
		 if(i4==3){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4524564441992000&pid=15.1","http://ts1.mm.bing.net/th?id=H.4633721004951900&pid=15.1"," ���B�n��n���ϯ�(2���X�f)��a��T"," ��m: ��s�|��/�����j�D���f(��n��) "," �P��:�n��n���� ");
			 }
		 if(i4==4){
				ShowInformation("http://ts3.mm.bing.net/th?id=H.4824602173046842&pid=15.1","http://ts2.mm.bing.net/th?id=H.4604721386555257&pid=15.1"," ���B������(1���X�f)��a��T"," ��m:���B������1���X�f�~��������"," �P��:�n�䰪��");				 
			 }
	     if(i4==5){
				ShowInformation("http://ts3.mm.bing.net/th?id=H.4560216959879946&pid=15.1","http://ts2.mm.bing.net/th?id=H.4858450852381557&pid=15.1"," ���㤽���a��T"," ��m:�|���G�q12��58��(��n��)"," �P��:������s�|");
			 }
		 if(i4==6){
				ShowInformation("http://ts4.mm.bing.net/th?id=H.4874277806211751&pid=15.1","http://ts2.mm.bing.net/th?id=H.4573411047375129&pid=15.1"," �n���p��a��T"," ��m:�f����/���F��(�n��������)"," �P��:�|���\��");
			 }
		 if(i4==7){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4524564441992000&pid=15.1","http://ts1.mm.bing.net/th?id=H.4784517301995240&pid=15.1"," ���B�n��i���]��(5���X�f)��a��T"," ��m: ��s�|��/�����j�D���f(��n��) "," �P��:�n��n����");
			 }
		 if(i4==8){
				ShowInformation("http://ts3.mm.bing.net/th?id=H.4971266737441410&pid=15.1","http://ts3.mm.bing.net/th?id=H.4870201896863858&pid=15.1"," ���B��s��(1���X�f)��a��T"," ��m:���Y�_��/�����F�����q(��_��)"," �P��:�ìK��p ��M��¾");
			 }
		 if(i4==9){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4720483631958436&pid=15.1","http://ts1.mm.bing.net/th?id=H.4917163064888184&pid=15.1"," �n�䨮����a��T"," ��m:�����F���C�q�P�����F���C�q415�ѥ�e�f"," �P��:���B�n�䯸  �x�_���߹Ϯ��]�n�����");
			 }
		 if(i4==10){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4976880269265084&pid=15.1","http://ts4.mm.bing.net/th?id=H.4816269983943083&pid=15.1"," �n��@�T�����a��T"," ��m:�T����/�g�T�G��88��(�F�_��)"," �P��:���B�n��i���]��");
			 }
		 if(i4==11){
				ShowInformation("http://ts4.mm.bing.net/th?id=H.4635640881874695&pid=15.1","http://ts4.mm.bing.net/th?id=H.4693884900936063&pid=15.1"," �ⶳ������a��T"," ��m:�����F���C�q�P�����F���C�q415�ѥ�e�f"," �P��:���B�n�䯸  �x�_���߹Ϯ��]�n�����");
			 }
	
	}
   if(i==5){
	   String s5=JOptionPane.showInputDialog(null,"You choose �U�ذ�  and then choose which section that you want?\n 1=�C�~����3���X�f     2=�꿳�C�~���f");
	   int i5=Integer.parseInt(s5);
		 if(i5==1){
			 ShowInformation("http://ts1.mm.bing.net/th?id=H.5025628171666504&pid=15.1","http://ts1.mm.bing.net/th?id=H.4721729163757808&pid=15.1"," �C�~����3���X�f��a��T"," ��m:�C�~��/�C�~��106��(�F��)"," �P��:�C�~������y��");
		 }
		 if(i5==2){
			 ShowInformation("http://ts2.mm.bing.net/th?id=H.4780475726561901&pid=15.1","http://ts4.mm.bing.net/th?id=H.4551712922929735&pid=15.1"," �꿳�C�~���f��a��T"," ��m:�꿳��/�C�~��(��n��)"," �P��:�C�~����B�ʳ�");
		 }
   }
   if(i==6){
	   String s6=JOptionPane.showInputDialog(null,"You choose ������  and then choose which section that you want?\n 1=Y-17�C�֦~�|�֤���3=���B���ɦx��(1���X�f)  5=�n������  \n 2=��a�Ϯ��]                 4=���B�O�j��|(4���X�f)");
	   int i6=Integer.parseInt(s6);
		if(i6==1){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4771825697947700&pid=15.1","http://ts4.mm.bing.net/th?id=H.4739587657566771&pid=15.1"," Y-17�C�֦~�|�֤��߷�a��T"," ��m: �L�˫n��/���R���@�q���f(�F�_��) "," �P��:�F����p ���\���� �x�j��|  �ժ��]���îw");
			}
		if(i6==2){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.5004952155719096&pid=15.1","http://ts1.mm.bing.net/th?id=H.4800769440153960&pid=15.1"," ��a�Ϯ��]��a��T"," ��m: ���s�n��/�Q����f(��n��)"," �P��:���������� ���إ���~�泡  �n������");
			}
		if(i6==3){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4920560409183250&pid=15.1","http://ts2.explicit.bing.net/th?id=H.4691810451720405&pid=15.1"," ���B���ɦx��(1���X�f)��a��T"," ��m: �Ѭz��/�����F���@�q(�F�_��)"," �P��:���ɦx �x�_����   �ߪk�|");
			}
		if(i6==4){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4702556462318596&pid=15.1","http://ts4.mm.bing.net/th?id=H.4901671134233615&pid=15.1"," ���B�O�j��|(4���X�f)��a��T"," ��m:�����/������(��n��)"," �P��:��ߥx�W�ժ��]    228��������  �x�j��| ");
			}
		if(i6==5){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.5011566446579164&pid=15.1","http://ts4.mm.bing.net/th?id=H.4710467796534755&pid=15.1"," �n�������a��T"," ��m:�M������@�q/�n����"," �P��:���B�j�F��");
			}
		   }
  if(i==7){
	  String s7=JOptionPane.showInputDialog(null,"You choose ���s��  and then choose which section that you want?\n1=�a�P���                            5=���B��Ѯc��(1���X�f) \n2=���B��Ѯc��(3���X�f) 6=�ذ�A�w��f\n3=�ذ���K���f                   7=�K�w����   \n4=�L�ˤ���                            8=���s��F����"); 
	  int i7=Integer.parseInt(s7);
		 if(i7==1){
			 ShowInformation("http://ts4.mm.bing.net/th?id=H.4676752289170831&pid=15.1","http://ts1.mm.bing.net/th?id=H.4575296588678068&pid=15.1"," �a�P����a��T"," ��m:���`��/�s�����f(��n��)"," �P��:�a�P����  ���`��p"); 
		 }
		 if(i7==2){
			 ShowInformation("http://ts1.mm.bing.net/th?id=H.4932457422064000&pid=15.1","http://ts2.mm.bing.net/th?id=H.4663914612000913&pid=15.1"," ���B��Ѯc��(3���X�f)��a��T"," ��m: ���B��Ѯc��3���X�f���~ "," �P��:��Ѯc"); 
		 }
		 if(i7==3){
			 ShowInformation("http://ts3.mm.bing.net/th?id=H.4926998548318094&pid=15.1","http://ts1.mm.bing.net/th?id=H.5050706495801600&pid=15.1"," �ذ���K���f��a��T"," ��m: �ذ�_��/���K���f(�_��) "," �P��:�x�_�j�� �j�P����"); 
		 }
		 if(i7==4){
			 ShowInformation("http://ts3.mm.bing.net/th?id=H.4843689085307094&pid=15.1","http://ts3.mm.bing.net/th?id=H.4941476874421846&pid=15.1"," �L�ˤ����a��T"," ��m:�L�˥_��/�n�ʪF���@�q"," �P��:�Y�Y�ʳf   �ѷݰs��"); 
		 }
		 if(i7==5){
			 ShowInformation("http://ts1.mm.bing.net/th?id=H.4932457422064000&pid=15.1","http://ts3.mm.bing.net/th?id=H.4820113976329090&pid=15.1"," ���B��Ѯc��(1���X�f)��a��T"," ��m: ���B��Ѯc1���X�f���(�Q������) "," �P��:��Ѯc"); 
		 }
		 if(i7==6){
			 ShowInformation("http://ts2.mm.bing.net/th?id=H.4832569397085005&pid=15.1","http://ts1.mm.bing.net/th?id=H.4700769750417452&pid=15.1"," �ذ�A�w��f��a��T"," ��m: �ذ�_��/�A�w��f(���o����Ŧa) "," �P��:�a�P���� "); 
		 }
		 if(i7==7){
			 ShowInformation("http://ts2.mm.bing.net/th?id=H.4688584919745301&pid=15.1","http://ts2.mm.bing.net/th?id=H.4903462094307805&pid=15.1"," �K�w������a��T"," ��m:�ذ�n���@�q/�����j�D��e�f(�_��)"," �P��:�����j�D "); 
		 }
		 if(i7==8){
			 ShowInformation("http://ts3.mm.bing.net/th?id=H.4935335033571810&pid=15.1","http://ts1.mm.bing.net/th?id=H.4603501618333124&pid=15.1"," ���s��F���߷�a��T"," ��m:�Q����/�A�w��f"," �P��:�A�w����"); 
		 }
	   }
   if(i==8){
	   String s8=JOptionPane.showInputDialog(null,"You choose ��s��  and then choose which section that you want?\n 1=�v�d�j�Ǥ��]�հ�"); 
		int i8=Integer.parseInt(s8);
		 ShowInformation("http://ts4.mm.bing.net/th?id=H.4772633143871611&pid=15.1","http://ts4.mm.bing.net/th?id=H.4805313517715527&pid=15.1"," �v�d�j�Ǥ��]�հϷ�a��T"," ��m: �v�j���]�հϮժ��f(�Ŧ{����) "," �P��:��ߥx�W�j��");
	
        }
     	}



    //I create  a method that can read 2 images , station name ,location and introduction of this station.
	public static void ShowInformation(String WebAddress ,String WebAddress2, String name , String location , String introduction){
		 // If the exception occurs
	     //URL=Uniform Source Locator 
	     //MalformedURLException is thrown if the URL string has a syntax error
		URL URl = null;
	    try {
	    URl = new URL(WebAddress);
	    } catch (MalformedURLException e) {
	    e.printStackTrace();
	    }

	    BufferedImage image = null;
	    try {
	    	image = ImageIO.read(URl);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }

	    URL UR2 = null;
	    try {
	    UR2 = new URL(WebAddress2);
	    } catch (MalformedURLException e) {
	    e.printStackTrace();
	    }

	    BufferedImage image2 = null;
	    try {
	    	image2 = ImageIO.read(UR2);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    //Create 2 images
	    JLabel label = new JLabel(new ImageIcon(image));
	    JLabel label2=new JLabel(new ImageIcon(image2));
	    //Create Name label
	    JLabel Name = new JLabel(name);	
	    //Create Location label
	    JLabel Location = new JLabel(location);
	    // //Create Introduction label
	    JLabel Introduction = new JLabel(introduction);
	    JPanel text = new JPanel(new GridLayout(4 , 2));
	    //Add  these labels to frame 
	    text.add(Name);
	    text.add(Location);
	    text.add(Introduction);
	    JFrame frame = new JFrame();
	    //add label and panel to frame
	    frame.setLayout(new BorderLayout(5 , 10));
	    frame.add(label , BorderLayout.WEST);
	    frame.add(label2 , BorderLayout.EAST);
	    frame.add(text , BorderLayout.SOUTH);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(label);
	    frame.pack();
	    frame.setLocation(300,300);
	    frame.setVisible(true);
	}
	
}