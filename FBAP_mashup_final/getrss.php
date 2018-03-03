<?php
//get the q parameter from URL
$q=$_GET["q"];

//find out which feed was selected
if($q=="Google") {
  $xml=("https://news.google.com/news/rss/headlines/section/topic/HEADLINE?ned=us&hl=en&gl=US");
} elseif($q=="NBC") {
  $xml=("http://rss.msnbc.msn.com/id/3032091/device/rss/rss.xml");
}elseif($q=="BBC news") {
  $xml=("http://feeds.bbci.co.uk/news/rss.xml");
}elseif($q=="Sport") {
  $xml=("http://www.wionews.com/rss/football.xml?section=cricket");
}elseif($q=="India") {
  $xml=("https://news.google.com/news/rss/headlines/section/topic/NATION.en_in/India?ned=in&hl=en-IN&gl=IN");
}elseif($q=="Cnn news") {
  $xml=("http://rss.cnn.com/rss/edition_americas.rss");
}elseif($q=="WION news") {
  $xml=("http://www.wionews.com/rss/business-economy.xml?section=business-economy");
}




$xmlDoc = new DOMDocument();
$xmlDoc->load($xml);

//get elements from "<channel>"
$channel=$xmlDoc->getElementsByTagName('channel')->item(0);
$channel_title = $channel->getElementsByTagName('title')
->item(0)->childNodes->item(0)->nodeValue;
$channel_link = $channel->getElementsByTagName('link')
->item(0)->childNodes->item(0)->nodeValue;
$channel_desc = $channel->getElementsByTagName('description')
->item(0)->childNodes->item(0)->nodeValue;

//output elements from "<channel>"
echo("<p><a href='" . $channel_link
  . "'>" . $channel_title . "</a>");
echo("<br>");
echo($channel_desc . "</p>");

//get and output "<item>" elements
$x=$xmlDoc->getElementsByTagName('item');
for ($i=0; $i<=10; $i++) {
  $item_title=$x->item($i)->getElementsByTagName('title')
  ->item(0)->childNodes->item(0)->nodeValue;
  $item_link=$x->item($i)->getElementsByTagName('link')
  ->item(0)->childNodes->item(0)->nodeValue;
  $item_desc=$x->item($i)->getElementsByTagName('description')
  ->item(0)->childNodes->item(0)->nodeValue;
  echo ("<p><a href='" . $item_link
  . "'>" . $item_title . "</a>");
  echo ("<br>");
  echo ($item_desc . "</p>");
}
?>