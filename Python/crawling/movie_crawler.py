import requests
from bs4 import BeautifulSoup
url = 'http://www.cgv.co.kr//common/showtimes/iframeTheater.aspx?areacode=01&amp;theatercode=0013&amp;date=20200105'
html = requests.get(url)
soup = BeautifulSoup(html.text, 'html.parser')

fordx = soup.select_one('span.forDX')
if(fordx):
    fordx = fordx.find_parent('div',class_ = 'col-times')
    title = fordx.select_one('div.info-movie > a > strong').text.strip()
    print(title+ ' 4DX 예매가 열렸습니다.')
else:
    print('4DX 예매가 아직 열리지 않았습니다.')
