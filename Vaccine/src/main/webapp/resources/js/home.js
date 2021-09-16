function onClickSubmit() {
	var e = document.getElementById('identification');
	if (e.checked) {
		location.href = 'landing.do';
	} else {
		window.alert('접종자 본인임을 확인해주세요.');
	}
}