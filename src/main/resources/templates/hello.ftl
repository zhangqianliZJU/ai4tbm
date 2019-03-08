<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <#--引入javascript-->
    <script src="/static/js/echarts.js"></script>
    <title>Ai4TBM</title>
</head>
<body>
<h1 align="center">${msg}</h1>
<h2 align="center">Hello,尿尿去了!!!。</h2>
<div align="center">
    <img src="/static/img/pigeon.jpg" align="middle" width="400px" height="300px"><br>
</div>
<div id="main" align="center" style="height: 400px;width: 600px;alignment: center;"></div>
    <#--做一个Echarts实例-->
<script type="text/javascript">
    var mychart = echarts.init(document.getElementById('main'));
    var option = {
        title:{text:'Echarts 入门实例'},
        toolip:{},
        legend:{data:['销量']},
        xAxis:{data:['衬衫','羊毛衫','雪纺衫','裤子','高跟鞋','袜子']},
        yAxis:{},
        series:[{name:'销量',type:'bar',data:[5, 20, 36, 10, 10, 20]}]
    };
    mychart.setOption(option);
</script>

<#--<div align="center">
    <img src="/static/img/pigeon.jpg" align="middle" width="400px" height="300px"><br>
</div>-->
</body>
</html>