# 单词总复习



[TOC]

<div STYLE="page-break-after: always;"></div>

## 集合单词

| **单词/引用**  | **翻译/解释** |
| :------------: | :-----------: |
|                |               |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">***@Collection***</font> |               |
| add() | 添加元素 |
| remove() | 去除 |
| contains() | 是否穿在指定元素 |
| clear() | 清除 |
| isEmpty() | 是否为空 |
| size() | 个数 |
| size(index,element) | |
|  | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@List***</font> | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@ArrayList***</font> | |
|  | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@LinkeList***</font> |               |
|   **addFirst**   |   **开头**    |
|    **addLast**    |   **末尾**    |
| ...First ...Last | ... ... |
|  |               |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@Set***</font> | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@HashSet***</font> | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@LinkedHashSet***</font> | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@TreeSet***</font> | |
| | |
|  <font color="#f5f5dc" style="background: rgb(152,59,255)">**@Interator***</font>  |  **迭代器**   |
| next() | 下一个元素 |
|  **hasNext**   | **判断下一个元素有无** |
| previous() | 返回列表中上一个元素 |
| hasPrevious() | 判断上一个元素有无 |
| add() | 添加到列表 |
|  |  |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">***@Collections***</font> | |
| **sort()** | **升序** |
| **reverse()** | **反转** |
| **shuffle()** | **洗牌** |
| | |
|  **Compatable ** |  **自然排序** |
|   **Comparator **  | **比较器排序** |
|   **compare **   |   **比较**     |
|                |               |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**Map**</font> |   **地图 **    |
|    **Key **   |     **键   **    |
|   **Value**    |    **值**    |
|    **put**    |  **添加元素  **  |
|   **entrySet **   |  **便利使用 **   |
|                |               |

---




<div STYLE="page-break-after: always;"></div>

## IO单词

| **单词** | **解释 / 翻译** |
| :--: | :--: |
| ========================= | ========================= |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@File**</font> | **文件** |
| <font color="#f5f5dc" style="background: red">**创建方法**</font> |  |
| **createNewFile()** | **不存在时,创建新文件** |
|  **mkdir()**  | **创建目录** |
| **mkdirs()** | **创建目录,包含其父目录** |
| <font color="#f5f5dc" style="background: red">**操作方法**</font> |  |
| **isDirectory** | **是否为目录** |
| **isFile()** | **是否为文件** |
| **exists** | **是否存在** |
| **getAbsolutePath** | **获取绝对路径** |
| **getPath** | **获取相对路径** |
| **getName()** | **返回目录/文件名** |
| **list()** | **返回此文件/目录名称字符串数组** |
| **listFile()** | **~File对象数组** |
| <font color="#f5f5dc" style="background: red">**删除方法**</font> | |
| **delete** | **删除该文件/目录** |
|  |  |
|  |  |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@字节流**</font> | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**#InputStream**</font> | |
| <font color="#f5f5dc" style="background: red">**@FileInputStream**</font> |  |
| <font color="#f5f5dc" style="background: red">**@BufferedInputStream**</font> | (文件字节流) |
|  | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**#OutputStream**</font> | |
| <font color="#f5f5dc" style="background: red">**@FileOutputStream**</font> | (url,true)结尾写 |
| <font color="#f5f5dc" style="background: red">**@BufferedOutputStream**</font> | |
|  | |
|  | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**@字符流**</font> | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**#Reader**</font> | |
| <font color="#f5f5dc" style="background: red">**@InputStreamReader**</font> | (文件字节流 , 字符集) |
| <font color="#f5f5dc" style="background: blue">@BufferedIntputStream</font> | |
| <font color="#f5f5dc" style="background: red">**BufferedRead**</font> | |
|  | |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**#Writer**</font> | |
| <font color="#f5f5dc" style="background: red">**@OutputStreamReader**</font> | |
| <font color="#f5f5dc" style="background: blue">@BufferedOutputStream</font> | |
|  | |
|  | |
|  | |
| **finally** | **最终** |
| **close** | **释放资源** |
|  | |
| **read** | **读取** |
| **write** | **写入** |
| **Reader** | **读者** |
| **Writer** | **作家** |
|  |  |
| **flush** | **刷新** |
|  |  |
| **PrintStream** | **字节打印流** |
| **PrintWriter** | **字符打印流** |
|  | |
| **ObjectOutputStream** | **对象序列化流** |
| **ObjectInputStream** | **对象反序列化流** |
| **Serializable** | **可序列化接口** |
| **serialVersionUID** | **序列版本UID** |
| **transient** | **不可序列化** |
| | |





<div STYLE="page-break-after: always;"></div>

## 多线程单词

|                             单词                             |        解释         |
| :----------------------------------------------------------: | :-----------------: |
| =============================== | =============================== |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**#Thread**</font> |      **线程**       |
|                          **run()**                           |  **要重写的方法**   |
|                         **start()**                          |  **启动调用方法**   |
| <font color="#f5f5dc" style="background: red">**线程控制**</font> ||
|                          **sleep(long)**                          |    **休眠 暂停**    |
|                           **join()**                           |  **等待线程死亡**   |
|                        **setDaemon(boolean)**                        |  **设置守护 线程**  |
| <font color="#f5f5dc" style="background: red">**设置获取调度**</font> |                     |
|                       **getPriority**                        |  **获取线程调度**   |
|                       **setPriority**                        |  **设置线程调度**   |
|                      **currentThread**                       | **获取当前线程名**  |
|                                                                                                                            |                     |
|                         <font color="#f5f5dc" style="background: rgb(152,59,255)">**#Runnable**</font>                         |    **/线程接口**    |
|                                                              |                     |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**线程同步**</font> | |
|                       **synchronized(obj)**                       |     **同步化**      |
|                          **Vector**                          | **List集合 同步化** |
|                        **Hashtable**                         | **Map集合  同步化** |
|                                                              |                     |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**同步化改进**</font> |  |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">**#Lock**</font> | **锁 / 接口** |
| <font color="#f5f5dc" style="background: red">**@ReentrantLock**</font> | **重入锁 / 实现** |
|                           **lock()**                           |    **上锁**    |
|                **unlock()**               |  **开锁**  |
|                          **wait()**                          |            **等待**             |
|                          **notify()**                          |       **通知 / 唤醒等待**       |
|                           **notifyAll()**                           |             |
|                                                    |  |
|                                                              |                     |







<div STYLE="page-break-after: always;"></div>

## 网络编程

|    单词     | 翻译 // 使用 |
| :---------: | :----------: |
| =========================== | =========================== |
|<font color="#f5f5dc" style="background: rgb(152,59,255)">**@InteAddress**</font>|**因特网IP地址 工具类**|
|@. **getByName(host/ip)**||
|obj. **getHostName()**|**获取主机名**|
|obj. **getHostAddress()**|**返回ip字符串**|
|||
|<font color="#f5f5dc" style="background: rgb(152,59,255)">**UDP通信协议**</font>|   |
|<font color="#f5f5dc" style="background: red">**@发送信息**</font>| |
|**@DatagramSocket**|**()** |
|**@DatagramPacket**|**(byte[], byte.length, ip, 端口)** |
|<font color="#f5f5dc" style="background: red">**@接收信息**</font>| |
|**@DatagramSocket**|**(端口)** |
|**@DatagramPacket**|**(byte[], byte.length)** |
|dp. **getData()**|**返回一个byte[] 获取数据** |
|**new String()**|**(new String(dp.getData(),0,dp.getLength()))** |
|| |
|<font color="#f5f5dc" style="background: rgb(152,59,255)">**TCP通信协议**</font>| |
|<font color="#f5f5dc" style="background: red">**@发送信息**</font>| |
|**@Socket**|**(ip, 端口)** |
|@. **getOutputStream()**|**获取输出流 写数据** |
|@. **getInputStream()**|**获取输入流 接收反馈** |
|@. **shutdownOutput()**|**停止发送标语** |
|<font color="#f5f5dc" style="background: red">**@接收信息**</font>| |
|**@ServerSocket**|**(端口)** |
|@. **accept()**|**返回一个Socket 监听客户端连接** |
|**@Socket**| |
|accept. **getInputStream()**|**获取输入流 接收消息** |
|accept. **getOutputStream()**|**获取输出流 给出反馈** |
|| |
|<font color="#f5f5dc" style="background: rgb(152,59,255)">**其它**</font>| |
|**Socket**|**插座 // 套接字**|
|**Packet**|**数据包**  |
|**send**|**发送**   |
|**receive**|**接收**   |
|**Server**|**服务器**  |
|**Client**|**客户端**  |
|**accept**|**接受**   |
|**shutdown**|**关闭**   |
|**Internet**|**因特网**  |
|| |
---





<div STYLE="page-break-after: always;"></div>

## Lambda表达式

|          单词           |      翻译//解释      |
| :---------------------: | :------------------: |
|                         |                      |
|       **Lambda**        |        **λ**         |
| **FunctionalInterface** |  **函数式接口注解**  |
|     **Comparable**      |     **自然排序**     |
|     **Comparator**      |    **比较器排序**    |
|                         |                      |
|      **Supplier**       |   **供应商 接口**    |
|                         |                      |
|      **Consumer**       |   **消费者 接口**    |
|       **accept**        |       **接受**       |
|                         |                      |
|      **Predicate**      |  **谓语判断 接口**   |
|        **test**         | **测试 // 最终判断** |
|       **negate**        |   **取消 // 求非**   |
|      **and / or**       | **逻辑与 / 逻辑或**  |
|                         |                      |
|      **Function**       |  **类型转换 接口**   |
|        **apply**        |       **申请**       |
|                         |                      |

----


<div STYLE="page-break-after: always;"></div>

## λ 和 Stream流

|   **单词**   |  **解释**  |
| :----------: | :--------: |
|              |            |
|  **Stream**  |   **流**   |
|              |            |
|  **filter**  |  **过滤**  |
|              |            |
|  **limit**   |  **限制**  |
|              |            |
|   **skip**   |  **跳过**  |
|              |            |
|  **concat**  |  **合并**  |
|              |            |
| **distinct** | **不同的** |
|              |            |
|  **sorted**  |  **分类**  |
|              |            |





<div STYLE="page-break-after: always;"></div>

## 字符串

|       单词       |    解释    |
| :--------------: | :--------: |
|                  |            |
|      length      |    长度    |
|      equals      |    地位    |
|      concat      |    拼接    |
|  charAt(index)   |  单个字符  |
|     indexOf      | 1出现位置  |
|                  |            |
|    substring     |    截取    |
|     replace      |    替换    |
|      split       |    分割    |
|                  |            |
|   toLowerCase    |    小写    |
|   toUpperCase    |    大写    |
| equalsIgnoreCase | 忽略大小写 |
|                  |            |
|  StringBuffered  |            |
|      append      | 拼接字符串 |
|    setcharAt     |  修改单个  |
|                  |            |





<div STYLE="page-break-after: always;"></div>

## 包装类

| 包装类 / 解释 | 基本类型 / 解释 |
| :-----------: | :-------------: |
|               |                 |
|   @Integer    |      @int       |
|   parseInt    |    字符转int    |
|    ValueOf    |  字符转Integer  |
|   intValue    |   int获取对象   |
|  shortValue   |  short获取对象  |
|   toString    |   int转String   |
|               |                 |
|   @Boolean    |    @boolean     |
| parseBoolear  |    字符串bo     |
|               |                 |
|     @Byte     |      @byte      |
|               |                 |
|  @Character   |      @char      |
|  isUpperCase  |    是否大写     |
|  isLowerCase  |    是否小写     |
|  toUpperCase  |    全部大写     |
|  toLowerCase  |    全部小写     |
|   isLetter    |    是否字母     |
|    isDigit    |    是否数字     |
|               |                 |
|    @Double    |     @double     |
|               |                 |



<div STYLE="page-break-after: always;"></div>

## Math数学工具类

|    单词     |    解释    |
| :---------: | :--------: |
|             |            |
|    Math     |    数学    |
|     PI      |   圆周率   |
|  sin / cos  |  正/余弦   |
|             |            |
|     exp     |  e平方根   |
| sqrt(s1,s2) | s1的s2方根 |
| pow(s1,s2)  | s1的s2次方 |
|    cbrt     |   立方根   |
|     log     |    对数    |
|             |            |
|     max     |   较大者   |
|     min     |   较小值   |
|             |            |
|     abs     |   绝对值   |
|    floor    |  向下取整  |
|    ceil     |  向上取整  |
|    round    |  四舍五入  |
|             |            |

---

---









---

## 权限修饰符

|   单词    |   解释   |
| :-------: | :------: |
|           |          |
|  public   |  公共的  |
| protected | 受保护的 |
| (default) |  默认的  |
|  private  |  私有的  |
|           |          |
---
---


<div STYLE="page-break-after: always;"></div>

## 时间日记类

|       单词        |           解释            |
| :---------------: | :-----------------------: |
|                   |                           |
|       @Date       |           @日期           |
|      getTime      |         获取日期          |
|      setTime      |         设置日期          |
|                   |                           |
| @SimpleDameFormat |      时间日期格式类       |
|      format       | 格式化 / Date ---> String |
|       parse       |  解析 / String ---> Date  |
|                   |                           |
|                   |                           |

**@SimpleDameFormat**

|字母|日期或时间元素|表示|示例|
|:----:|:---:|:---:|:---:|
|||||
|G|Era标志|Text|AD|
|y|年|Year|1996；96|
|G| Era| 标志符 | Text  AD  |
|y| 年 | Year | 1996; 96 |
|M| 年中的月份| Month | July; Jul; 07  |
|w| 年中的周数| Number | 27  |
|W| 月份中的周数| Number | 2|
|D| 年中的天数| Number | 189 |
|d| 月份中的天数| Number| 10 |
|F| 月份中的星期| Number | 2 |
|E| 星期中的天数| Text | Tuesday; Tue  |
|a| Am/pm 标记| Text | PM |
|H| 一天中的小时数（0-23）| Number | 0 |
|k| 一天中的小时数（1-24）| Number | 24 |
|K| am/pm 中的小时数（0-11）|  Number| 0 |
|h| am/pm 中的小时数（1-12）|  Number| 12 |
|m| 小时中的分钟数 | Number| 30 |
|s| 分钟中的秒数 | Number | 55 |
|S| 毫秒数 | Number| 978 |
|z| 时区 | General time zone| Pacific Standard Time; PST; GMT-08:00|
|Z| 时区 | RFC 822 time zone |-0800 |





<div STYLE="page-break-after: always;"></div>

## 反射
|          单词          |             解释             |
| :-----------------------: | :-----------------------------: |
|                         |                               |
|          class          |              类              |
|        getClass        |            获取类            |
|         forName         |            路径名            |
|                         |                               |
|        Declared        |           公布公开           |
|      setAccessible      |          设置可使用          |
|                         |                               |
|      @Constructor      |            @构造器            |
|     getConstructors     |   获取所有公共构造器  数组   |
| getDeclaredConstructors |  获取所有构造器         数组  |
|     getConstructor     |      获取单个公共构造器      |
| getDeclaredConstructor |        获取单个构造器        |
|      ￥newInstance      |     ￥使用构造器创建对象     |
|                         |                               |
|         @Field         |          @成员变量类          |
|        getFields        |  获取所有公共成员变量  数组  |
|    getDeclaredFields    | 获取所有成员变量         数组 |
|        getField        |     获取单个公共成员变量     |
|    getDeclaredField    |       获取单个成员变量       |
|          ￥set          |       ￥使用该成员变量       |
|                         |                               |
|         @Method         |            @方法类            |
|       getMethods       |  获取所有公共成员方法  数组  |
|   getDeclaredMethods   | 获取所有成员方法         数组 |
|        getMethod        |     获取单个公共成员方法     |
|    getDeclaredMethod    |       获取单个成员方法       |
|        ￥invoke        |       ￥使用该成员方法       |
|                         |                               |



<div STYLE="page-break-after: always;"></div>
## JDBC单词



|          单词          |        解释        |
| :--------------------: | :----------------: |
|     DriverManager      |      驱动管理      |
|       Connection       |        连接        |
|       Statement        |     陈述；说明     |
|        execute         |        处决        |
|         Update         |        修改        |
|         Query          |        查询        |
|       ResultSet        |       结果集       |
|  Prepare**d**Stement   |  预备 & 说明 [类]  |
|     prepareStement     | 准备 & 说明 [方法] |
|     setAutoCommit      |    设置自动提交    |
|         commit         |        提交        |
|        rollback        |        回滚        |
|                        |                    |
|         Druid          |       德鲁伊       |
|       Properties       |        属性        |
|          load          |        装载        |
|       DataSource       |       数据源       |
| DruidDataSourceFactory |  德鲁伊数据源工厂  |
|                        |                    |
|                        |                    |











<div STYLE="page-break-after: always;">

## Tomcat_Maven_Servlet

|                             单词                             |                             解释                             |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
|                          packaging                           |                             打包                             |
|                           version                            |                             版本                             |
|                                                              |                                                              |
|                            Apache                            |                            阿帕奇                            |
|                            Tomcat                            |                            汤姆猫                            |
|                            Maven                             |                             专家                             |
|                                                              |                                                              |
|                           Servlet                            |                          小型服务器                          |
|                         @WebServlet                          |                                                              |
|                         urlPatterns                          |                        网址方式 /模式                        |
|                        loadOnStartup                         |                           装载启动                           |
|                           init ()                            |                            初始化                            |
|                          service ()                          |                             服务                             |
|                            server                            |                            服务器                            |
|                          destroy ()                          |                             销毁                             |
|                      getServletInfo ()                       |                     获取Servlet对象信息                      |
|                     getServletConfig ()                      |                     获取Servlet配置对象                      |
|                                                              |                                                              |
|                         HttpServlet                          |                                                              |
|                            doGet                             |                           get方法                            |
|                            doPost                            |                           post方法                           |
|                                                              |                                                              |
|                           Request                            |                             请求                             |
|                           Response                           |                             响应                             |
|                                                              |                                                              |



<div STYLE="page-break-after: always;">
## Tomcat_Maven_Servlet_Request


|                             单词                             |                             解释                             |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">***@ServletRequest***</font> | <font color="#f5f5dc" style="background: rgb(152,59,255)">***@ServletRequest***</font> |
|                     @HttpServletRequest                      |                                                              |
|                        @RequestFacade                        |                            /外观                             |
|                                                              |                                                              |
| <font color="#f5f5dc" style="background: red">获取请求数据</font> |                                                              |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">获取请求行数据</font> |                                                              |
|                          getMethod                           |                           获取方法                           |
|                        getContextPath                        |                         获取虚拟目录                         |
|                        getRequestURL                         |                      获取统一资源定位符                      |
|                        getRequestURI                         |                      获取统一资源标识符                      |
|                        getQueryString                        |                         获取请求参数                         |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">获取请求头数据</font> |                                                              |
|                          getHeader                           |                          获取请求头                          |
|                          user-agent                          |                          浏览器信息                          |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">获取请求体数据</font> |                                                              |
| <font color="#f5f5dc" style="background: rgb(152,59,255)">Post有请求体</font> | <font color="#f5f5dc" style="background: rgb(152,59,255)">Get没有请求体</font> |
|                        getInputStream                        |                          获取字节流                          |
|                          getReader                           |                          获取字符流                          |
|                                                              |                                                              |
| <font color="#f5f5dc" style="background: red">共用请求参数</font> |                                                              |
|                       getParameterMap                        |                      获取所有参数的Map                       |
|                      <String,String[]>                       |                             泛型                             |
|                      getParameterValues                      |                   根据名称获取参数值[数组]                   |
|                         getParameter                         |                   根据名称获取参数值(单个)                   |
|                                                              |                                                              |
| <font color="#f5f5dc" style="background: red">中文解码</font> |                                                              |
|                         @URLEncoder                          |                                                              |
|                            encode                            |                             编码                             |
|                         @URLDecoder                          |                                                              |
|                            decode                            |                             解码                             |
|                     setCharacterEncoding                     |                       post请求解决方案                       |
|                  String=>getByts => String                   |                         get请求方案                          |
|                                                              |                                                              |
| <font color="#f5f5dc" style="background: red">请求转发</font> |                                                              |
|                 getRequestDispatcher("url")                  |                         获取请求转发                         |
|                      .forward(req,resp)                      |                          前进/向前                           |
|                      **RequestMethod**                       |                                                              |
|                   setAttribute(key,valueO)                   |                          属性/特征                           |
|                      getAttribute(key)                       |                       通过key获取value                       |
|                     removeAttribute(key)                     |                          删除键值对                          |
|                                                              |                                                              |
| <font color="#f5f5dc" style="background: red">Response重定向</font> |                                                              |
|                           方式一:                            |                                                              |
|                      res.setStatus(int)                      |                        设置想要状态码                        |
|               res.setHeader("Location","url")                |                       设置重定向的目录                       |
|                           方式二:                            |                                                              |
|                    res.sendRedirect(url)                     |                           发送转发                           |
|                                                              |                                                              |
|                                                              |           



## Tomcat_Maven_Servlet_Response

|                             单词                             |            解释             |
| :----------------------------------------------------------: | :-------------------------: |
|                                                              |                             |
| <font color="#f5f5dc" style="background: red">Response重定向</font> |                             |
|                           方式一:                            |                             |
|                      res.setStatus(int)                      |       设置想要状态码        |
|               res.setHeader("Location","url")                |      设置重定向的目录       |
|                           方式二:                            |                             |
|                    res.sendRedirect(url)                     |                             |
|                                                              |                             |
| <font color="#f5f5dc" style="background: red">响应字符数据</font> |                             |
|                          getWriter                           |                             |
|                         centent-type                         | 用于定义网络文件的类型/编码 |
|                          text/html                           |         以html格式          |
|                       setContentType()                       |                             |
|                   text/html;charset=utf-8                    |          参数格式           |
|                                                              |                             |
|                           IOUtils                            |                             |
|                             copy                             |                             |
|                                                              |                             |



