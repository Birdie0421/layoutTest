# layoutTest

###测试界面布局的三种方式


#####首页
<img src="http://img.blog.csdn.net/20170301120039084?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvRUEwNDIx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" width="50%" alt=""/>



#####线性布局  LinearLayout
由于其中三行没有把行填充满，所以在嵌套的每个线性布局中对最后一个控件的属性
由  `android:layout_width="wrap_content"`
改为`android:layout_width="fill_parent"`	
即可让最后一个控件自适应使得界面相对美观
<img src="http://img.blog.csdn.net/20170301120119227?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvRUEwNDIx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" width="50%" alt=""/>
#####修改后的 LinearLayout
<img src="http://img.blog.csdn.net/20170302190215279?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvRUEwNDIx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" width="50%" alt=""/>

#####相对布局  RelativeLayout
<img src="http://img.blog.csdn.net/20170301120148303?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvRUEwNDIx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" width="50%" alt=""/>
#####表格布局  TableLayout
第一次做的表格布局与PPT中要求的布局少了两条横线，当时并不了解怎么添加表格边框，网上查阅资料后，方法如下：
在 TableLayout的属性中加入背景色
`android:background="#A8A8A8"`
注意此处的背景色为 **边框** 所需的颜色

然后在每个TableRow中分别添加黑色的背景色
` <TableRow android:background="#000000">`

在所需要添加边框的地方  则 使用
       ` android:background="#000000"
        android:layout_marginBottom="1dip"`
 其中  根据边框的位置  可以使用
 `android:layout_marginBottom
  android:layout_marginLeft
  android:layout_marginRight
  android:layout_marginTop
  android:layout_margin`
  分别设置下边框、左边框、右边框、上边框、全边框
        

<img src="http://img.blog.csdn.net/20170301120345476?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvRUEwNDIx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" width="50%" alt=""/>

修改后的TableLayout

<img src="http://img.blog.csdn.net/20170302191251940?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvRUEwNDIx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" width="50%" alt=""/>

