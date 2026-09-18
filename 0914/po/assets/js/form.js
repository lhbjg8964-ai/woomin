   const form = document.getElementById('contactForm');
    if (!form) return;
    
    const nameInput = document.getElementById('name');
    const emailInput = document.getElementById('email');
    const subjectInput = document.getElementById('subject');
    const messageInput = document.getElementById('message');

    //실시간 유효성 검사 (이름을 입력했는지, 패스워드나 이메일검사)

    if(nameInput){
        nameInput.addEventListener('blur', validateName);
        nameInput.addEventListener('input',  clearErrorOnInput);
    }

    //nme 올바르게 입력되있는지 검사
       function validateName() {
        const name = nameInput.value.trim(); //입력한 이름을 공백제거후 가져오기
        const errorElement = document.getElementById('nameError');
        
        if (name === '') { //이름이 비어있는지 
            showError('nameError', '이름을 입력해주세요.');
            return false;
        } else if (name.length < 2) { //이름이 2자미만인지 
            showError('nameError', '이름은 2자 이상 입력해주세요.');
            return false;
        } else { //정상적으로 입력됬다면 
            hideError('nameError'); //기존에 에러있으면 감추고
            nameInput.classList.add('valid');//valid 추가 하고 
            nameInput.classList.remove('error'); // error 클래스 제거
            return true; //정상적입력
        }
    }