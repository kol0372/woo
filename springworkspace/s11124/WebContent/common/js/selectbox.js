(function($){
	$.fn.extend({
		customSelect: function() {
			var select = $(this),
				selectNum = null;
			if (!select.get(0)){return false}
			$.each(select, function(i) {
				var thisSelect = $(this),
					selectList,
					thisSelected,
					openState = false,
					selectWidth = thisSelect.width(),
					thisSelectList = thisSelect.find('option');
				var openStateFn = function() {
					selectList.remove();
					$(document).unbind('click', openStateFn);
					openState = false;
					selectNum = null;
				};

				thisSelect.css({ display: 'none' })
					.wrap('<span></span>').parent()
					.attr({'class' : 'select-box' + thisSelect.attr('class').replace('select', '') })
					.css({ width: selectWidth + 'px' })
					.append('<span class="selected">' + thisSelectList.filter(':selected').text() + '</span>')
					.click(function() {
						if (openState == true || selectNum == i) {
							selectNum = null;
							return;
						}
						if (selectNum != null && selectNum != i) {
							if ($('ul.select-box-list').is() == false) selectList = $('ul.select-box-list');
							selectList.remove();
						}
						thisSelected = $(this);
						selectList = $('<ul></ul>').attr({
							'class' : 'select-box-list' + thisSelect.attr('class').replace('select', '')
						}).appendTo('body');
						
						selectList.css({
							left: thisSelected.offset().left + 'px',
							top: thisSelected.offset().top + thisSelected.outerHeight() - 1 + 'px',
							width: thisSelected.width() + 'px'
						});
						$.each(thisSelectList, function(i) {
							$('<li>' + $(this).text() + '</li>').appendTo(selectList)
								.click(function() {
									openState = false;
									thisSelected.find('span').text(thisSelectList.eq(i).text());
									//thisSelect.val(thisSelectList.eq(i).val());
									thisSelect.change(function() {
										$(this).val(thisSelectList.eq(i).val());
									}).change();
									selectList.remove();
									return false;
								}).hover(function() { $(this).addClass('hover'); }, function() { $(this).removeClass('hover'); });
						});
						//openState = true;
						selectNum = i;
						$(document).bind('click', openStateFn);
						return false;
					});
			});
		}
	})
	$(document).ready(function() {
		//$('select.select').customSelect();
	})
})(jQuery)