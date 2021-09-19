function onClickSubmit() {
	var value = null;
	var infos = document.getElementsByName('chk-info');
	for(var i = 0; i < infos.length; i++) {
		if (infos[i].checked) {
			value = infos[i].value;
			break;
		}
	}
	
	if (value != null) {
		location.href = value + 'Auth.do';
	} else {
		window.alert('본인 인증 방법을 선택해주세요.');
	}
}