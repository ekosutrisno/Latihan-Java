
let xhr = new XMLHttpRequest();
xhr,onreadystatechange = function(){

	if(xhr.readyState == 4 && xhr.status ==200){
		let data = JSON.parse(this.responseText);
		console.log(data);
	}
}
xhr.open('GET', 'data.json',true);
xhr.send();