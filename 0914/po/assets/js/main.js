//메뉴 토글 기능

const menuToggle = document.getElementById('menuToggle');
const mainNav = document.getElementById('mainNav');

if(menuToggle && mainNav){
    menuToggle.addEventListener('click',function(){
        mainNav.classList.toggle('active');
    });

}