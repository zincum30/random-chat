var socket = io();

  		var form = document.getElementById('form');
  		var input = document.getElementById('input');
      var userCnt = document.getElementById('userCnt');
      var userCount = 0;
      var name = '';

      /* 접속 되었을 때 실행 */
      socket.on('connect', function() {
        /* 이름을 입력받고 */
        name = prompt('닉네임을 입력해주세요 !', '')

        /* 이름이 빈칸인 경우 */
        if(!name) {
          name = '익명'
        }

        /* 서버에 새로운 유저가 왔다고 알림 */
        socket.emit('newUser', name)

        socket.emit('chat message', name+'님이 접속을 하였습니다.');
      })

      socket.on('users.count', function(number) {
        document.getElementById('usersCount').innerHTML=number;
      });

      socket.on('disconnectUser', function(data){
        socket.emit('chat message', data);
      })

      input.addEventListener('keydown', function(e){
        if(e.keyCode == 13){
          if(!e.shiftKey){
            e.preventDefault();
            var submitBtn = document.getElementById('submitBtn');
            submitBtn.click();
          }
        }
      })


  		form.addEventListener('submit', function(e) {
  		  	e.preventDefault(); // submit 방지
  		  	if (input.value) { // 인풋에 값이 있다면
  		  	  socket.emit('chat message', name+': '+input.value); // 소켓.emit
  		  	  input.value = '';
  		  	}
  		});
  		socket.on('chat message', function(msg) {
  		  	var item = document.createElement('pre');
  		  	item.textContent = msg;
  		  	messages.appendChild(item);
  		  	window.scrollTo(0, document.body.scrollHeight);
  		});