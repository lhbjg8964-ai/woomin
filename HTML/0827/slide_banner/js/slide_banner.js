$(function(){
var visual = $('#brandVisual > ul > li'); // 큰사진
var button = $('#buttonList > li'); // pager 버튼
var current = 0; // 현재 사진
var id;
// var i;

button.click(function(){ // 버튼 클릭시 색상 변경, 슬라이드를 움직이는 함수 호출
    var i = $(this).index(); // i 는 현재 함수에서만 유효(지역변수)
    // alert(i);
    button.removeClass('on'); // 버튼의 모든 클래스 제거
    button.eq(i).addClass('on');
    // $(this).addClass('on');
    move(i);
    return false();
});

function timer(){
    setInterval(function(){
        var n = current + 1;
        if(n === 3){
        n = 0;    
        }
            button.eq(n).trigger('click');
            // 컴퓨터가 1씩 증가하면서 버튼을 강제로 클릭
    },3000);
}
timer();
function move(i){
    if(current == i) return;
    // 현재 활성화 된 button(검정 버튼)과 클릭한 버튼이 같으면 빠져나가라.

    var cu = visual.eq(current); // 현재 사진 (시작 시 0)
    var ne = visual.eq(i); // 클릭한 인덱스 i 사진]
    cu.css('left', '0').stop().animate({'left':'-100%'},500);
    ne.css('left', '100%').stop().animate({'left':'0'},500);
    current = i;
}

});