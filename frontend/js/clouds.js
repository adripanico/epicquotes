$(document).ready(function() {
	$('.cloud').each(function() {
		$(this).css('left', randomLeft($('#sky')));
		$(this).css('top', randomTop($('#sky')));
		fly($(this), randomDuration());
	});
});

function fly(cloud, duration) {
	console.log(duration);
	$(cloud).animate(
		{ left: $('#sky').width() },
		duration,
		'linear',
		function() {
			$(cloud).css('left', -parseInt($(cloud).css('width')));
			$(cloud).css('top', randomTop($('#sky')));
			fly($(cloud), randomDuration());
		}
	);
}

function randomLeft(sky) {
	var width = Math.round(Math.random() * parseInt($(sky).css('width')) + 1) + 'px';
	return width;
}

function randomTop(sky) {
	var height = Math.round(Math.random() * parseInt($(sky).css('height')) + 1) + 'px';
	return height;
}

function randomDuration() {
	var min_duration = 10000;
	var max_duration = 40000;
	var duration = Math.round(Math.random() * (max_duration - min_duration )) + 1;
	duration += min_duration ;
	return duration ;
}