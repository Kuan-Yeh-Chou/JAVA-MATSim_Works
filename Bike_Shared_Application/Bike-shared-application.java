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
		String s=JOptionPane.showInputDialog(null,"Enter what district that you want to find?\n 1=大安區     5=萬華區  \n 2=信義區     6=中正區 \n 3=松山區     7=中山區   \n 4=南港區     8=文山區");
		//Then after choosing the district you would be ask to choose the location where U-BIKE  are
		int i=Integer.parseInt(s);
	    //After you choose one of the location it will informed you of where the U-BIKE station that you are, how the place nearby looks like ,nearby map that can clearly realize where you are  and what constructions are adjacent to the U-BIKE stations .
		if(i==1){
			String s1=JOptionPane.showInputDialog(null,"You choose 大安區  and then choose which section that you want?\n 1=捷運科技大樓站            5=信義建國路口               9=金山愛國路口                      13=基隆長興路口\n" +
					" 2=辛亥新生路口                 6=捷運六張犁站              10=臺大資訊大樓                    14=捷運東門站(4號出口)\n 3=臺灣師範大學(圖書館) 7=捷運公館站(2號出口) 11=捷運忠孝新生(3號出口)  15=龍門廣場 \n 4=臺北市立圖書館(總館) 8=新生和平路口               12=台灣科技大學                    16=仁愛醫院");
			int i1=Integer.parseInt(s1);		
		if(i1==1){
		  
			ShowInformation("http://ts4.mm.bing.net/th?id=H.4701169191289795&pid=15.1" , "http://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Technology_Building_Station_20091102a.jpg/250px-Technology_Building_Station_20091102a.jpg", "科技大樓站當地資訊" , " 位置:台北市大安區復興南路2段235號" ,"周週:" +
					"國立台北教育大學 國北教大實小 國立台灣大學復興南路校門 台北高等行政法院 成功國宅 科技大樓（國家科學委員會、資策會）");
		}
		if(i1==2){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4996409493359269&pid=15.1","http://ts2.mm.bing.net/th?id=H.4844702685135409&pid=15.1" , " 辛亥新生路口當地資訊" , "位置:辛亥路與新生南路交叉之路口" ," 周邊:耕莘文教院（22號）"+
                  "台北捷運標誌捷運台電大樓站  建國高架道路辛亥路段  公務人力發展中心 國立台灣大學  台北憲兵隊南區分隊");
		}
		if(i1==3){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4716210151295508&pid=15.1","http://ts3.mm.bing.net/th?id=H.4940330103539490&pid=15.1"," 臺灣師範大學(圖書館)當地資訊","位置:臺北市和平東路1段129號 "," 周邊:師大夜市 ");
		}
		if(i1==4){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4584174285751230&pid=15.1","http://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Taipei_Public_Library_%28Main_Library%29.JPG/230px-Taipei_Public_Library_%28Main_Library%29.JPG","臺北市立圖書館(總館)當地資訊"," 位置:台北市大安區建國南路二段125號","週邊:大安森林公園");
		}
		if(i1==5){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.5023089822597821&pid=15.1","http://ts2.mm.bing.net/th?id=H.4760143324251297&pid=15.1"," 信義建國路口當地資訊"," 位置:信義路與建國南路交叉之路口"," 周邊:國立師範大學附屬高級中學  美國在台協會(AIT) ");
		}
		if(i1==6){
			ShowInformation("http://ts4.mm.bing.net/th?id=H.5028458543975419&pid=15.1","http://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Liuzhangli_Station_Birdview.jpg/300px-Liuzhangli_Station_Birdview.jpg"," 捷運六張犁站 當地資訊"," 位置:臺北市大安區和平東路3段168號"," 周邊:法務部台北市調查處"+
                    "  國軍福利總處   遠東企業中心");
		}
		if(i1==7){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.5032654708802213&pid=15.1","http://ts3.mm.bing.net/th?id=H.5021676785960890&pid=15.1"," 捷運公館站(2號出口)當地資訊"," 位置:羅斯福路4段靠舟山路"," 周邊:國立台灣大學   公館夜市商圈");
		}
		if(i1==8){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4583169249247881&pid=15.1","http://ts3.mm.bing.net/th?id=H.5059455281596918&pid=15.1"," 新生和平路口當地資訊"," 位置:新生南路與和平東路之交叉口"," 周邊:大安行政中心   大安森林公園");
		}
		if(i1==9){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4949547104207489&pid=15.1","http://ts3.mm.bing.net/th?id=H.4650827854252158&pid=15.1"," 金山愛國路口當地資訊"," 位置:金山南路與愛國東路之交叉口"," 周邊:永康街商圈   中正紀念堂  金華國小");
		}
		if(i1==10){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4640584388905530&pid=15.1","http://ts4.mm.bing.net/th?id=H.4874058785292687&pid=15.1"," 臺大資訊大樓當地資訊"," 位置:辛亥路二段(臺大外語學院外)"," 周邊:國立台灣大學新社科院");
		}
		if(i1==11){
			ShowInformation("http://ts4.mm.bing.net/th?id=H.4528893756638767&pid=15.1","http://ts3.mm.bing.net/th?id=H.4837933807895054&pid=15.1"," 捷運忠孝新生(3號出口)當地資訊"," 位置: 台北市大安區新生南路一段67號 "," 周邊:台北科技大學   光華商場   中山女中");
		}
		if(i1==12){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.5005295758409949&pid=15.1","http://ts2.mm.bing.net/th?id=H.4741340015756177&pid=15.1"," 台灣科技大學當地資訊"," 位置: 臺北市大安區基隆路 4 段 43 號"," 周邊:國立台灣大學  公館國小  公館夜市商圈");
		}
		if(i1==13){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4795314864849416&pid=15.1","http://ts2.mm.bing.net/th?id=H.4686458932758473&pid=15.1"," 基隆長興路口當地資訊"," 位置:基隆路與長興接之交叉路口"," 周邊:國立台灣大學  台灣科技大學  長興BOT");
		}
		if(i1==14){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4786819399289122&pid=15.1","http://ts1.mm.bing.net/th?id=H.4613195387045320&pid=15.1"," 捷運東門站(4號出口)當地資訊"," 位置:麗水街（信義路二段148巷口)"," 周邊:永康街商圈   東門市場    中華郵政總公司");
		}
		if(i1==15){
			ShowInformation("http://ts2.mm.bing.net/th?id=H.4636813395954321&pid=15.1","http://ts4.mm.bing.net/th?id=H.4937181869572535&pid=15.1"," 龍門廣場當地資訊"," 位置:台北市大安區建國南路二段269號"," 周邊:龍門國中  書田尿診  大安森林公園 ");
		}
		if(i1==16){
			ShowInformation("http://ts4.mm.bing.net/th?id=H.4637281550599407&pid=15.1","http://ts4.mm.bing.net/th?id=H.4554062262370795&pid=15.1"," 仁愛醫院當地資訊"," 位置:臺北市大安區仁愛路四段10號"," 周邊:福華大飯店 ");
		}
				}
   if(i==2){
	   String s2=JOptionPane.showInputDialog(null,"You choose 信義區  and then choose where the that you want?\n 1=捷運市政府站(3號出口)-1   5=捷運市政府站(3號出口)-2   9=捷運國父紀念館站      13=台北市政府               17=永吉松信路口\n" +
					" 2=市民廣場                                 6=興雅國中                                 10=世貿二館                      14=信義廣場(台北101) 18=五常公園\n 3=世貿三館                                 7=松德站                                     11=台北市災害應變中心 15=三張犁 \n 4=臺北醫學大學                        8=福德公園                                 12=松山家商                       16=中強公園\n");
	   int i2=Integer.parseInt(s2);	
	   if(i2==1){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4930541875366689&pid=15.1","http://ts4.mm.bing.net/th?id=H.4760602947551583&pid=15.1"," 捷運市政府站(3號出口)-1當地資訊"," 位置:忠孝東路/松仁路(東南側) "," 周邊:台北市政府  台北轉運站  統一阪急百貨 新光三越");  
	   }
	   if(i2==2){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4988455203701316&pid=15.1","http://ts4.mm.bing.net/th?id=H.4727780804726079&pid=15.1"," 市民廣場當地資訊"," 位置:市府路/松壽路(西北側)"," 周邊:君悅大飯店   台北世貿中心");  
	   }
	   if(i2==3){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4746846165928542&pid=15.","http://ts3.mm.bing.net/th?id=H.5001511932789906&pid=15.1"," 世貿三館 當地資訊"," 位置:市府路/松壽路(東南側) "," 周邊:台北世貿中心  君悅大飯店    ");  
	   }
	   if(i2==4){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.5030258150998388&pid=15.1","http://ts3.mm.bing.net/th?id=H.4912009092204778&pid=15.1"," 臺北醫學大學當地資訊"," 位置:台北市信義區吳興街220巷59弄"," 周邊:台北醫學大學附設醫院");  
	   }
	   if(i2==5){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4930541875366689&pid=15.1","http://ts4.mm.bing.net/th?id=H.4760602947551583&pid=15.1"," 捷運市政府站(3號出口)-2 當地資訊"," 位置:忠孝東路/松仁路(東南側)"," 周邊:台北市政府  台北轉運站  統一阪急百貨 新光三越");  
	   }
	   if(i2==6){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4699262195664016&pid=15.1","http://ts3.mm.bing.net/th?id=H.4858455187063918&pid=15.1"," 興雅國中當地資訊"," 位置:松仁路/松仁路95巷(東南側) "," 周邊:松壽廣場公園  中華電信");  
	   }
	   if(i2==7){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4699528509196824&pid=15.1","http://ts2.mm.bing.net/th?id=H.4927934814751509&pid=15.1"," 松德站當地資訊"," 位置: 台北市信義區松德路300號 "," 周邊: 虎林公園  永春高中");  
	   }
	   if(i2==8){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4656729152946824&pid=15.1","http://ts1.mm.bing.net/th?id=H.4725315477635736&pid=15.1"," 福德公園當地資訊"," 位置:大道路/福德街路口北西側"," 周邊:罶公國中  福德國小");  
	   }
	   if(i2==9){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4878353711893337&pid=15.1","http://ts2.mm.bing.net/th?id=H.4714487882907789&pid=15.1"," 捷運國父紀念館站當地資訊"," 位置:忠孝東路四段與光復南路之交叉口"," 周邊:國父紀念館  光復國小");  
	   }
	   if(i2==10){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4893892945313930&pid=15.1","http://ts2.mm.bing.net/th?id=H.4634335212669201&pid=15.1"," 世貿二館當地資訊"," 位置:智路/松廉路(東北側)"," 周邊:台北世貿中心  君悅大飯店  信義威秀 新光三越");  
	   }
	   if(i2==11){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4551210415229165&pid=15.1","http://ts2.mm.bing.net/th?id=H.4929515374839837&pid=15.1"," 台北市災害應變中心當地資訊"," 位置: 台北市信義區莊敬路391巷11弄2號  "," 周邊:信義國中");  
	   }
	   if(i2==12){
		   ShowInformation("http://ts4.mm.bing.net/th?id=H.4645119860277843&pid=15.1","http://ts1.mm.bing.net/th?id=H.4645119860277844&pid=15.1"," 松山家商當地資訊"," 位置:林口街/福德街(南東側)"," 周邊:松山家商");  
	   }
	   if(i2==13){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.5010595797667370&pid=15.1","http://ts3.mm.bing.net/th?id=H.4673694257776970&pid=15.1"," 台北市政府當地資訊"," 位置: 台北市政府東門(松智路)  "," 周邊:台北市政府  台北轉運站  統一阪急百貨 新光三越");  
	   }
	   if(i2==14){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.5010595797667370&pid=15.1","http://ts3.mm.bing.net/th?id=H.4671430828230690&pid=15.1"," 信義廣場(台北101)當地資訊"," 位置:松智路/信義路(東北側) "," 周邊:台北101  紐約紐約  新光三越  威秀影城");  
	   }
	   if(i2==15){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4715278144636541&pid=15.1","http://ts2.mm.bing.net/th?id=H.5026169332434549&pid=15.1"," 三張犁當地資訊"," 位置:光復南路/基隆路一段364巷"," 周邊:文昌街");  
	   }
	   if(i2==16){
		   ShowInformation("http://ts4.mm.bing.net/th?id=H.5064549110908055&pid=15.1","http://ts1.mm.bing.net/th?id=H.4676473127371332&pid=15.1"," 中強公園當地資訊"," 位置:松仁路153巷17號對面"," 周邊:三犁公園  信義國中  典美藝文空間");  
	   }
	   if(i2==17){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4769626668009469&pid=15.1","http://ts3.mm.bing.net/th?id=H.4955190717582322&pid=15.1"," 永吉松信路口當地資訊"," 位置:松信路/永吉路南西側人行道"," 周邊:五常公園");  
	   }
	   if(i2==18){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4769626668009469&pid=15.1","http://ts3.mm.bing.net/th?id=H.5021672460518290&pid=15.1"," 五常公園當地資訊"," 位置: 松隆路/虎林街30巷口(西南側) "," 周邊:松山火車站   饒河夜市");  
	   }
   }
   if(i==3){
	   String s3=JOptionPane.showInputDialog(null,"You choose 松山區  and then choose which section that you want?\n1=饒河夜市          5=民生光復路口 \n 2=社教館             6=民生敦化路口\n 3=松山車站         7=中崙高中   \n 4=民權運動公園 8=臺北田徑場");
	   int i3=Integer.parseInt(s3);	
	   if(i3==1){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4838990379746857&pid=15.1","http://ts2.mm.bing.net/th?id=H.4756621508018849&pid=15.1"," 饒河夜市當地資訊"," 位置: 八德路/松信路(西南側) "," 周邊:饒河夜市   市民大道  松山火車站");  
		      }
	   if(i3==2){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.5038139445805105&pid=15.1","http://ts1.mm.bing.net/th?id=H.4932861188048232&pid=15.1"," 社教館當地資訊"," 位置:八德路三段25號前"," 周邊:台北市立體育場");  
	      }
	   if(i3==3){
		   ShowInformation("http://ts1.mm.bing.net/th?id=H.4781686912648772&pid=15.1","http://ts4.mm.bing.net/th?id=H.4546726465373115&pid=15.1"," 松山車站當地資訊"," 位置: 松山車站西出口外自行車格內 "," 周邊:饒河夜市  市民大道 ");  
	      }
	   if(i3==4){
		   ShowInformation("http://ts4.mm.bing.net/th?id=H.4674626261681151&pid=15.1","http://ts3.mm.bing.net/th?id=H.5060799667963838&pid=15.1"," 民權運動公園當地資訊"," 位置: 民權東路四段/新中街交叉口 "," 周邊:松山空軍機場  撫遠公園 ");  
	      }
	   if(i3==5){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4959640311562790&pid=15.1","http://ts4.mm.bing.net/th?id=H.4692222751934235&pid=15.1"," 民生光復路口當地資訊"," 位置:光復北路/民生東路(西北側)"," 周邊:民生公園  敦北公園 ");  
	      }
	   if(i3==6){
		   ShowInformation("http://ts3.mm.bing.net/th?id=H.4959640311562790&pid=15.1","http://ts4.mm.bing.net/th?id=H.4697441111313171&pid=15.1"," 民生敦化路口當地資訊"," 位置:敦化民生路口公車站旁"," 周邊:中山國中");  
	      }
	   if(i3==7){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.4777658261045417&pid=15.1","http://ts4.mm.bing.net/th?id=H.4692931438184803&pid=15.1"," 中崙高中當地資訊"," 位置: 八德路四段91巷(中崙高中)旁 "," 周邊:京華城  市民大道");  
	      }
	   if(i3==8){
		   ShowInformation("http://ts2.mm.bing.net/th?id=H.5040634769900581&pid=15.1","http://ts2.mm.bing.net/th?id=H.4654139302284681&pid=15.1"," 臺北田徑場當地資訊"," 位置: 敦化北路3號 "," 周邊:台北市立體育場  台視  敦化國小");  
	      }
   }
	if(i==4){
		 String s4=JOptionPane.showInputDialog(null,"You choose 南港區  and then choose which section that you want?\n1=東新國小                                          4=捷運昆陽站(1號出口)7=捷運南港展覽館站(5號出口)10=南港世貿公園\n2=玉成公園                                          5=中研公園                      8=捷運後山埤站(1號出口)         11=凌雲市場\n3=捷運南港軟體園區站(2號出口)  6=南港國小                      9=南港車站");
		 int i4=Integer.parseInt(s4);
		 if(i4==1){
			    ShowInformation("http://ts4.mm.bing.net/th?id=H.4757128311408447&pid=15.1","http://ts2.mm.bing.net/th?id=H.4669382151243617&pid=15.1"," 東新國小當地資訊"," 位置: 東新國小側門(東明街62號前)"," 周邊:東新國小 環東大道");
			 }
		 if(i4==2){
				ShowInformation("http://ts4.mm.bing.net/th?id=H.4936932798169987&pid=15.1","http://ts3.mm.bing.net/th?id=H.4908586001565714&pid=15.1"," 玉成公園當地資訊"," 位置:玉成街247號前"," 周邊:成德國中 玉成公園  協和高職");
			 }
		 if(i4==3){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4524564441992000&pid=15.1","http://ts1.mm.bing.net/th?id=H.4633721004951900&pid=15.1"," 捷運南港軟體園區站(2號出口)當地資訊"," 位置: 研究院路/市民大道路口(西南側) "," 周邊:南港軟體園區 ");
			 }
		 if(i4==4){
				ShowInformation("http://ts3.mm.bing.net/th?id=H.4824602173046842&pid=15.1","http://ts2.mm.bing.net/th?id=H.4604721386555257&pid=15.1"," 捷運昆陽站(1號出口)當地資訊"," 位置:捷運昆陽站1號出口外停車場旁"," 周邊:南港高中");				 
			 }
	     if(i4==5){
				ShowInformation("http://ts3.mm.bing.net/th?id=H.4560216959879946&pid=15.1","http://ts2.mm.bing.net/th?id=H.4858450852381557&pid=15.1"," 中研公園當地資訊"," 位置:院路二段12巷58弄(西南側)"," 周邊:中央研究院");
			 }
		 if(i4==6){
				ShowInformation("http://ts4.mm.bing.net/th?id=H.4874277806211751&pid=15.1","http://ts2.mm.bing.net/th?id=H.4573411047375129&pid=15.1"," 南港國小當地資訊"," 位置:惠民街/興東街(南側停車場)"," 周邊:育成功中");
			 }
		 if(i4==7){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4524564441992000&pid=15.1","http://ts1.mm.bing.net/th?id=H.4784517301995240&pid=15.1"," 捷運南港展覽館站(5號出口)當地資訊"," 位置: 研究院路/市民大道路口(西南側) "," 周邊:南港軟體園區");
			 }
		 if(i4==8){
				ShowInformation("http://ts3.mm.bing.net/th?id=H.4971266737441410&pid=15.1","http://ts3.mm.bing.net/th?id=H.4870201896863858&pid=15.1"," 捷運後山埤站(1號出口)當地資訊"," 位置:中坡北路/忠孝東路五段(西北側)"," 周邊:永春國小 協和高職");
			 }
		 if(i4==9){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4720483631958436&pid=15.1","http://ts1.mm.bing.net/th?id=H.4917163064888184&pid=15.1"," 南港車站當地資訊"," 位置:忠孝東路七段與忠孝東路七段415巷交叉口"," 周邊:捷運南港站  台北市立圖書館南港分部");
			 }
		 if(i4==10){
				ShowInformation("http://ts1.mm.bing.net/th?id=H.4976880269265084&pid=15.1","http://ts4.mm.bing.net/th?id=H.4816269983943083&pid=15.1"," 南港世貿公園當地資訊"," 位置:三重路/經貿二路88巷(東北側)"," 周邊:捷運南港展覽館站");
			 }
		 if(i4==11){
				ShowInformation("http://ts4.mm.bing.net/th?id=H.4635640881874695&pid=15.1","http://ts4.mm.bing.net/th?id=H.4693884900936063&pid=15.1"," 凌雲市場當地資訊"," 位置:忠孝東路七段與忠孝東路七段415巷交叉口"," 周邊:捷運南港站  台北市立圖書館南港分部");
			 }
	
	}
   if(i==5){
	   String s5=JOptionPane.showInputDialog(null,"You choose 萬華區  and then choose which section that you want?\n 1=青年公園3號出口     2=國興青年路口");
	   int i5=Integer.parseInt(s5);
		 if(i5==1){
			 ShowInformation("http://ts1.mm.bing.net/th?id=H.5025628171666504&pid=15.1","http://ts1.mm.bing.net/th?id=H.4721729163757808&pid=15.1"," 青年公園3號出口當地資訊"," 位置:青年路/青年路106巷(東側)"," 周邊:青年公園網球場");
		 }
		 if(i5==2){
			 ShowInformation("http://ts2.mm.bing.net/th?id=H.4780475726561901&pid=15.1","http://ts4.mm.bing.net/th?id=H.4551712922929735&pid=15.1"," 國興青年路口當地資訊"," 位置:國興路/青年路(西南側)"," 周邊:青年公園運動場");
		 }
   }
   if(i==6){
	   String s6=JOptionPane.showInputDialog(null,"You choose 中正區  and then choose which section that you want?\n 1=Y-17青少年育樂中心3=捷運善導寺站(1號出口)  5=南昌公園  \n 2=國家圖書館                 4=捷運臺大醫院(4號出口)");
	   int i6=Integer.parseInt(s6);
		if(i6==1){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4771825697947700&pid=15.1","http://ts4.mm.bing.net/th?id=H.4739587657566771&pid=15.1"," Y-17青少年育樂中心當地資訊"," 位置: 林森南路/仁愛路一段路口(東北側) "," 周邊:東門國小 成功高中 台大醫院  博物館典藏庫");
			}
		if(i6==2){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.5004952155719096&pid=15.1","http://ts1.mm.bing.net/th?id=H.4800769440153960&pid=15.1"," 國家圖書館當地資訊"," 位置: 中山南路/貴陽街口(西南側)"," 周邊:中正紀念藤 中華民國外交部  南門市場");
			}
		if(i6==3){
			ShowInformation("http://ts3.mm.bing.net/th?id=H.4920560409183250&pid=15.1","http://ts2.explicit.bing.net/th?id=H.4691810451720405&pid=15.1"," 捷運善導寺站(1號出口)當地資訊"," 位置: 天津街/忠孝東路一段(東北側)"," 周邊:善導寺 台北車站   立法院");
			}
		if(i6==4){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.4702556462318596&pid=15.1","http://ts4.mm.bing.net/th?id=H.4901671134233615&pid=15.1"," 捷運臺大醫院(4號出口)當地資訊"," 位置:公園路/襄陽路(西南側)"," 周邊:國立台灣博物館    228紀念公園  台大醫院 ");
			}
		if(i6==5){
			ShowInformation("http://ts1.mm.bing.net/th?id=H.5011566446579164&pid=15.1","http://ts4.mm.bing.net/th?id=H.4710467796534755&pid=15.1"," 南昌公園當地資訊"," 位置:和平西路一段/南昌路"," 周邊:捷運古亭站");
			}
		   }
  if(i==7){
	  String s7=JOptionPane.showInputDialog(null,"You choose 中山區  and then choose which section that you want?\n1=榮星花園                            5=捷運行天宮站(1號出口) \n2=捷運行天宮站(3號出口) 6=建國農安街口\n3=建國長春路口                   7=八德市場   \n4=林森公園                            8=中山行政中心"); 
	  int i7=Integer.parseInt(s7);
		 if(i7==1){
			 ShowInformation("http://ts4.mm.bing.net/th?id=H.4676752289170831&pid=15.1","http://ts1.mm.bing.net/th?id=H.4575296588678068&pid=15.1"," 榮星花園當地資訊"," 位置:五常街/龍江路口(西南側)"," 周邊:榮星公園  五常國小"); 
		 }
		 if(i7==2){
			 ShowInformation("http://ts1.mm.bing.net/th?id=H.4932457422064000&pid=15.1","http://ts2.mm.bing.net/th?id=H.4663914612000913&pid=15.1"," 捷運行天宮站(3號出口)當地資訊"," 位置: 捷運行天宮站3號出口站外 "," 周邊:行天宮"); 
		 }
		 if(i7==3){
			 ShowInformation("http://ts3.mm.bing.net/th?id=H.4926998548318094&pid=15.1","http://ts1.mm.bing.net/th?id=H.5050706495801600&pid=15.1"," 建國長春路口當地資訊"," 位置: 建國北路/長春路口(北側) "," 周邊:台北大學 大同高中"); 
		 }
		 if(i7==4){
			 ShowInformation("http://ts3.mm.bing.net/th?id=H.4843689085307094&pid=15.1","http://ts3.mm.bing.net/th?id=H.4941476874421846&pid=15.1"," 林森公園當地資訊"," 位置:林森北路/南京東路一段"," 周邊:欣欣百貨   老爺酒店"); 
		 }
		 if(i7==5){
			 ShowInformation("http://ts1.mm.bing.net/th?id=H.4932457422064000&pid=15.1","http://ts3.mm.bing.net/th?id=H.4820113976329090&pid=15.1"," 捷運行天宮站(1號出口)當地資訊"," 位置: 捷運行天宮1號出口後方(松江路側) "," 周邊:行天宮"); 
		 }
		 if(i7==6){
			 ShowInformation("http://ts2.mm.bing.net/th?id=H.4832569397085005&pid=15.1","http://ts1.mm.bing.net/th?id=H.4700769750417452&pid=15.1"," 建國農安街口當地資訊"," 位置: 建國北路/農安街口(中油旁邊空地) "," 周邊:榮星公園 "); 
		 }
		 if(i7==7){
			 ShowInformation("http://ts2.mm.bing.net/th?id=H.4688584919745301&pid=15.1","http://ts2.mm.bing.net/th?id=H.4903462094307805&pid=15.1"," 八德市場當地資訊"," 位置:建國南路一段/市民大道交叉口(北側)"," 周邊:市民大道 "); 
		 }
		 if(i7==8){
			 ShowInformation("http://ts3.mm.bing.net/th?id=H.4935335033571810&pid=15.1","http://ts1.mm.bing.net/th?id=H.4603501618333124&pid=15.1"," 中山行政中心當地資訊"," 位置:松江路/農安街口"," 周邊:農安公園"); 
		 }
	   }
   if(i==8){
	   String s8=JOptionPane.showInputDialog(null,"You choose 文山區  and then choose which section that you want?\n 1=師範大學公館校區"); 
		int i8=Integer.parseInt(s8);
		 ShowInformation("http://ts4.mm.bing.net/th?id=H.4772633143871611&pid=15.1","http://ts4.mm.bing.net/th?id=H.4805313517715527&pid=15.1"," 師範大學公館校區當地資訊"," 位置: 師大公館校區校門口(汀州路側) "," 周邊:國立台灣大學");
	
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