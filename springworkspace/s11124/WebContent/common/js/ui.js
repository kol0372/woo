(function($){
	$.fn.extend({
		mainVisualControl:function() {
			var _this = $(this),
				clickEvt = function() {
					_this.click();
				};
			setTimeout(function() {
				clickEvt();
				var objs = $("#main-visual button.remote-circle"),
					pause = $("#main-visual button.pause"),
					play = $("#main-visual button.play"),
					init;
				if ($("#main-visual .visual-child").length == 1) {
					_this.parent().addClass('banner-pause')
					pause.hide();
					play.hide();
				}
				if(objs.size == 1)
					return;
				
				var visualFun = function(){
					var objs = $("#main-visual button.remote-circle");
					var objs2 = $("#main-visual .visual-child");
					var temp;
					if(objs.size==1){
						return;
					}					
					for(var i=0;i<objs.size();i++){
						if($(objs.get(i)).hasClass("on")){
							temp = i;
						}
					}	
					if((temp+1)== objs.size()){
						var target = objs.get(0);						
						$(objs.get(temp)).removeClass("on")
						$(objs.get(0)).addClass("on");
						$("#main-visual").animate({
							opacity: 0
						  }, 200, function() {
							$("#main-visual").removeClass('visual0'+(temp+1));
							$("#main-visual").addClass('visual0'+1);
							$("#main-visual").animate({
							opacity: 1
						  }, 200);
							// Animation complete.
						  });
						$(objs2.get(temp)).removeClass("on")
						$(objs2.get(0)).addClass("on");
					  
						
					}else{
						var target = $(objs.get(temp+1));						
						$(objs.get(temp)).removeClass("on");
						$(objs.get(temp+1)).addClass("on");

						$("#main-visual").animate({
							opacity: 0
						  }, 200, function() {
							$("#main-visual").removeClass('visual0'+(temp+1));
							$("#main-visual").addClass('visual0'+(temp+2));
							$("#main-visual").animate({
							opacity: 1
						  }, 200);
							// Animation complete.
						  });
						$(objs2.get(temp)).removeClass("on")
						$(objs2.get(temp+1)).addClass("on");

					}
					return;
				}
				var visualRun = function() {
					if ($("#main-visual .visual-child").length == 1) {
						clearInterval(init);
					} else {
						clearInterval(init);
						init = setInterval(function() { visualFun(); },5000);
					}
				}
				if (!_this.parent().is('.banner-pause')) {
						objs.focusin(function() {
						clearInterval(init);
					})
					objs.focusout(function() {
						clearInterval(init);
						init = setInterval(function() { visualFun(); },5000);
					})
				}
				pause.click(function() {
					clearInterval(init);
					_this.parent().addClass('banner-pause');				
				})
				play.click(function() {
					_this.parent().removeClass('banner-pause');
					clearInterval(init);
					init = setInterval(function() { visualFun(); },5000);
				})
				visualRun();
				
			},1500);
		},
		mainVisual:function() {
			var _this = $(this),
				item = _this.find('button.remote-circle'),
				visualBody = _this.find('.visual-body'),
				visualChild = visualBody.find('>div'),
				visualControl = _this.find('.control-btn');
				if (!$('body').is('#english')){
					_this.addClass('visual01 close-visual');
					$('.control-btn').mainVisualControl();
				} else {
					_this.addClass('visual01');	
				}
				visualBody.hide();
				visualChild.eq(0).addClass('on');
			item.first().addClass('on');
			$.each(item,function(index) {
				$(this).attr('num',index+1)
				$(this).click(function() {
					var clearOn = _this.find('.on');
					clearOn.removeClass('on');
					_this.attr('class','visual0'+$(this).attr('num'));
					visualChild.eq($(this).attr('num')-1).addClass('on');
					$(this).addClass('on');
					return false;
				})
				$(this).focusin(function() {
					var clearOn = _this.find('.on');
					clearOn.removeClass('on');
					_this.attr('class','visual0'+$(this).attr('num'));
					visualChild.eq($(this).attr('num')-1).addClass('on');
					$(this).addClass('on');
					return false;
				})
			})
			visualControl.click(function() {
				if (_this.is('.close-visual')) {
					$(this).find('em').html('메인비쥬얼 닫기')
					visualBody.slideDown(700,'easeInOutQuart',function() {
						_this.removeClass('close-visual')
					});	
				} else {
					$(this).find('em').html('메인비쥬얼 열기')
					visualBody.slideUp(700,'easeInOutQuart',function() {
						_this.addClass('close-visual')
					});
				}	
			})
		},
		

		
		bannerControl:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					button = _this.find('.circle'),	
					item = _this.find('.cell');
				_this.attr('num',0)
				item.eq(0).addClass('on-cell');
				$.each(button,function(index) {
					$(this).attr('num',index);
					$(this).click(function() {
						var removeOn = _this.find('.on-circle');
							removeOn2 = _this.find('.on-cell');
						removeOn.removeClass('on-circle');
						removeOn2.removeClass('on-cell');
						_this.attr('num',$(this).attr('num'));
						$(this).addClass('on-circle');
						$(this).next().addClass('on-cell');
					})
					$(this).focusin(function() {
						var removeOn = _this.find('.on-circle');
							removeOn2 = _this.find('.on-cell');
						removeOn.removeClass('on-circle');
						removeOn2.removeClass('on-cell');
						_this.attr('num',$(this).attr('num'));
						$(this).addClass('on-circle');
						$(this).next().addClass('on-cell');
					})
				})
			})
			$('.banner-wrap').circleControl();	
		},
		circleControl:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					pause =  _this.find('.pause'),
					play =  _this.find('.play'),
					circle = _this.find('.circle'),
					item = _this.find('.cell'),
					init,
					num = _this.attr('num'),
					time = 2500,
					runpoint = 0;
				if (item.length == 1) {
					pause.hide();
					play.hide();
				}
				circle.first().addClass('on-circle')
				var clickEvent = function() {
					if (num == circle.length-1) {
						num = 0
					} else {
						num ++;
					}
					circle.eq(num).click();
					fnCircleRun();
				}
				var fnCircleRun = function() {
					clearTimeout(init);
					init = setTimeout(function() { clickEvent(); },time);
				}
				if (!_this.is('.pause-banner')) {
					circle.mouseenter(function() {
						clearTimeout(init);
					}).mouseleave(function() {
						if (_this.attr('num') == circle.length-1) {
							num = -1
						} else {
							num = _this.attr('num')
						}
						clearTimeout(init);
						init = setTimeout(function() { clickEvent(); },time);
					})
					item.mouseenter(function() {
						clearTimeout(init);
					}).mouseleave(function() {
						if (_this.attr('num') == circle.length-1) {
							num = -1
						} else {
							num = _this.attr('num')
						}
						clearTimeout(init);
						init = setTimeout(function() { clickEvent(); },time);
					})
					
					circle.focusin(function() {
						clearTimeout(init);
					})
					circle.focusout(function() {
						if (_this.attr('num') == circle.length-1) {
							num = -1
						} else {
							num = _this.attr('num')
						}
						if (_this.is('.pause-banner')) {
							clearTimeout(init);	
						} else {
							clearTimeout(init);
							init = setTimeout(function() { clickEvent(); },time);
						}
						
					})
					item.focusin(function() {
						clearTimeout(init);
					})
					item.focusout(function() {
						if (_this.attr('num') == circle.length-1) {
							num = -1
						} else {
							num = _this.attr('num')
						}
						if (_this.is('.pause-banner')) {
							clearTimeout(init);	
						} else {
							clearTimeout(init);
							init = setTimeout(function() { clickEvent(); },time);
						}
					})
				}
				pause.click(function() {
					clearTimeout(init);
					$(this).parent().addClass('pause-banner');
				})
				play.click(function() {
					$(this).parent().removeClass('pause-banner');
					if (_this.attr('num') == circle.length-1) {
						num = -1
					} else {
						num = _this.attr('num')
					}
					clearTimeout(init);
					init = setTimeout(function() { clickEvent(); },time);
				})
				fnCircleRun();
			});
		},
		/*mainServiceLink:function() {
			var _this = $(this),
				moveBody = _this.find('.service-inner'),
				leftBtn = _this.next().find('.left-btn'),
				rightBtn = _this.next().find('.right-btn');
			leftBtn.addClass('disabled').attr('disabled','disabled')
			leftBtn.click(function() {
				moveBody.stop().animate({marginLeft:0},500)
				rightBtn.removeClass('disabled').removeAttr('disabled')
				$(this).addClass('disabled').attr('disabled','disabled')
			})
			rightBtn.click(function() {
				moveBody.stop().animate({marginLeft:-135},500)
				leftBtn.removeClass('disabled').removeAttr('disabled')
				$(this).addClass('disabled').attr('disabled','disabled')
			})
				
		},*/
		mainContents:function() {
			var _this = $(this);
			/*$('.s1-service').mainServiceLink();*/
			$('.banner-wrap').bannerControl();
			
		},
		naviSubControl:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					item = 	_this.find('img');
				$.each(item,function() {
					$(this).mouseenter(function() {
						var imgSrc = $(this).attr('src');
						$(this).attr('src',/_out/.test(imgSrc) ? imgSrc.replace('_out','_over') :  imgSrc.replace('_over','_out'));
					}).mouseleave(function() {
						var imgSrc = $(this).attr('src');
						$(this).attr('src',/_out/.test(imgSrc) ? imgSrc.replace('_out','_over') :  imgSrc.replace('_over','_out'));
					})
					$(this).parent().focusin(function() {
						var imgSrc = $(this).children().attr('src');
						$(this).children().attr('src',/_out/.test(imgSrc) ? imgSrc.replace('_out','_over') :  imgSrc.replace('_over','_out'));
					})
					$(this).parent().focusout(function() {
						var imgSrc = $(this).children().attr('src');
						$(this).children().attr('src',/_out/.test(imgSrc) ? imgSrc.replace('_out','_over') :  imgSrc.replace('_over','_out'));
					})
				})
			})
		},
		naviControl:function() {
			var _this = $(this),
				item = _this.find('>li >.item a'),
				menu = item.find('.submenu'),
				bgObj = $('<div class="submenu-bg"></div>');
			bgObj.appendTo(_this.parent().parent());
			$.each(item,function() {
				$(this).click(function() {
					if (!$(this).parent().parent().is('.menu-on1')) {
						var $this = $(this),
							hideMenu = _this.find('.menu-on1');
						
						hideMenu.removeClass('menu-on');
						hideMenu.removeClass('menu-on1');
						hideMenu.find('.item').next().hide();
						$this.parent().parent().addClass('menu-on')
						$this.parent().parent().addClass('menu-on1')
						bgObj.stop().animate({height:$(this).parent().next().outerHeight()},{duration:700,easing:'easeInOutQuart',complete:function() {
							$this.parent().next().show();
						}})
						$('#contents-follow-wraper').slideUp();
						$('#depth-visual').animate({height:205},200)
					} else {
						var $this = $(this);
						$this.parent().parent().removeClass('menu-on');
						$this.parent().parent().removeClass('menu-on1');
						$this.parent().next().hide();
						bgObj.stop().animate({height:0},{duration:400,easing:'easeInOutQuart'})	
						$('#contents-follow-wraper').slideDown();
						$('#depth-visual').animate({height:205},200)
					}
					return false;
				});
				/*
				$(this).focusin(function() {
					if (!$(this).parent().parent().is('.menu-on')) {
						$(this).parent().parent().addClass('menu-on')
					}
				})
				$(this).focusout(function() {
					if ($(this).parent().parent().is('.menu-on')) {
						$(this).parent().parent().removeClass('menu-on')
					}
				})
				*/
			})
		},
		serviceRquest:function() {
			var _this = $(this),
				control = _this.find('.request-btn'),
				obj = _this.find('.request-form');
			control.click(function() {
				var $this = $(this);
				if (_this.attr('class') == 'request-on') {
					_this.find('.request-form').slideUp(700,'easeInOutQuart',function() {
						_this.removeClass('request-on');
						$this.find('>img').attr('alt','에스원 서비스 상담 신청 열기')
					});
				} else {
					_this.find('.request-form').slideDown(700,'easeInOutQuart',function() {
						_this.addClass('request-on');
						$($this.attr('href')).focus();
						$this.find('>img').attr('alt','에스원 서비스 상담 신청 닫기')
					});
				}
				return false;
			})
		},
		headerControl:function() {
			var _this = $(this);
			$('#service-request').serviceRquest();
			$('#navigation').naviControl();
			$('.s-menu').naviSubControl();
		},
		fixedQuick:function() {
			var _this = $(this),
				point = $('#article').find('h3'),
				target = point.next(),
				subAnc = _this.find('.submenu-link'),
				runpoint;
			if (!$('#wrap').is('.main-wrap')) {
				_this.css({top:point.offset().top})
				$(window).scroll(function() {
					if ($(window).scrollTop() > point.offset().top) {
						if (!runpoint) {
							_this.css({position:'fixed',top:point.height()+15});
							runpoint = 1;
						}
					} else {
						if (runpoint) {
							_this.css({position:'absolute',top:target.offset().top})
							runpoint = 0;
						}
					} 
				})
				$.each(subAnc,function() {
					$(this).click(function() {
						var $this = $(this);
						if (!$this.parent().is('.down')) {
							var checkDown = _this.find('.down'),
							checkSubmenu = checkDown.find('.quick-submenu');
							checkDown.removeClass('down');
							if (checkSubmenu.is(':visible')) {
								checkSubmenu.slideUp(500,function() {
									$this.parent().addClass('down');
									$this.next().slideDown();
								});
							} else {
								$this.parent().addClass('down');
								$this.next().slideDown();
							}
						} else {
							$this.parent().addClass('down');
							$this.next().slideUp();
						}
						return false;
					})
				})
			}
		},
		togglelistControl:function() {
			var _this = $(this),
				subject = _this.find('.subject a'),
				answer = _this.find('.answer');
				answer.hide();
			$.each(subject,function() {
				$(this).click(function() {
					if (!$(this).parent().parent().parent().parent().is('.row-on')) {
						$(this).parent().parent().parent().parent().addClass('row-on');
						$(this).parent().parent().parent().next().slideDown(100).addClass('answer-on');
					} else {
						$(this).parent().parent().parent().parent().removeClass('row-on');
						$(this).parent().parent().parent().next().slideUp(100).removeClass('answer-on');
					}
					return false;
					
				})
			})
		},
		togglelistControl2:function() {
			var _this = $(this),
				row = $(this).find('>li'),
				subject = _this.find('.question > a'),
				answer = _this.find('.answer');
				answer.hide();
				row.eq(0).addClass('row-on');
				row.eq(0).find('.answer').show();
			$.each(subject,function() {
				$(this).click(function() {
					if (!$(this).parent().parent().is('.row-on')) {
						$(this).parent().parent().addClass('row-on');
						$(this).parent().next().slideDown(100);
					} else {
						$(this).parent().parent().removeClass('row-on');
						$(this).parent().next().slideUp(100);
					}
					return false;
				})
			})
		},
		checkControl:function() {
			var _this = $(this),
				check = _this.find('.check'),
				obj = _this.find('.check-contents');
				obj.hide();
				_this.attr('num','0');
				obj.eq(_this.attr('num')).show().addClass('view');
			$.each(check,function() {
				$(this).click(function() {
					var clearCheck = _this.find('.checked');
						clearView = _this.find('.view');
					clearCheck.removeAttr('checked').removeClass('checked');
					clearView.hide().removeClass('view');

					_this.attr('num',$(this).attr('num'));
					$(this).attr('checked','checked').addClass('checked');
					obj.eq(_this.attr('num')).show().addClass('view');
				})
			})
		},
		checkControl2:function() {
			var _this = $(this),
				check = _this.find('.check'),
				obj = _this.find('.check-contents');
				obj.hide();
				_this.attr('num','0');
				check.eq(_this.attr('num')).attr('checked','checked').addClass('checked');
				obj.eq(_this.attr('num')).show().addClass('view');
			$.each(check,function() {
				$(this).click(function() {
					var clearCheck = _this.find('.checked');
						clearView = _this.find('.view');
					clearCheck.removeAttr('checked').removeClass('checked');
					clearView.hide().removeClass('view');

					_this.attr('num',$(this).attr('num'));
					$(this).attr('checked','checked').addClass('checked');
					obj.eq(_this.attr('num')).show().addClass('view');
				})
			})
		},
		tabControl:function() {
			var _this = $(this),
				tab = _this.find('.tab >li >a'),
				obj = _this.find('.tab-contents');
				obj.hide();
				tab.eq(0).parent().addClass('on');
				obj.eq(0).show().addClass('view');
			$.each(obj,function(index) {
				$(this).attr('id','tab-contents'+index);
			})
			$.each(tab,function(index) {
				$(this).attr('href','#tab-contents'+index);
				$(this).click(function() {
					var clearOn = _this.find('.on'),
						clearView =  _this.find('.view');
					clearOn.removeClass('on')
					clearView.hide().removeClass('view');
					$(this).parent().addClass('on');
					$($(this).attr('href')).show().addClass('view');
					return false;
				})
			})
		},
		tabControl2:function() {
			var _this = $(this),
				tab = _this.find('.tab02 >li >a'),
				obj = _this.find('.tab-contents02');
				obj.hide();
				tab.eq(0).parent().addClass('over');
				obj.eq(0).show().addClass('over-view');
			$.each(obj,function(index) {
				$(this).attr('id','tab-contents02-'+index);
			})
			$.each(tab,function(index) {
				$(this).attr('href','#tab-contents02-'+index);
				$(this).click(function() {
					var clearOn = _this.find('.over'),
						clearView =  _this.find('.over-view');
					clearOn.removeClass('over');
					clearView.hide().removeClass('over-view');
					$(this).parent().addClass('over');
					$($(this).attr('href')).show().addClass('over-view');
					return false;
				});
			})
		},
		tabControl3:function() { /* 20140325 추가 start*/
			var _this = $(this),
				tab = _this.find('.tab02 >li >a'),
				obj = _this.find('.tab-contents03');
				obj.hide();
				tab.eq(0).parent().addClass('over');
				obj.eq(0).show().addClass('over-view');
			$.each(obj,function(index) {
				$(this).attr('id','tab-contents03-'+index);
			})
			$.each(tab,function(index) {
				$(this).attr('href','#tab-contents03-'+index);
				$(this).click(function() {
					var clearOn = _this.find('.over'),
						clearView =  _this.find('.over-view');
					clearOn.removeClass('over');
					clearView.hide().removeClass('over-view');
					$(this).parent().addClass('over');
					$($(this).attr('href')).show().addClass('over-view');
					return false;
				});
			})
		}, /* 20140325 추가 end*/
		classCheck:function() {
			var _this = $(this),
				_class = _this.find('.class-check em'),
				obj = _this.find('.class-table');
			obj.hide();
			$.each(obj,function() {
				if (_class.attr('name') == $(this).attr('name')) {
					$(this).show();
				}
			})
		},
		dimmedFrame:function() {
			var _this = $(this),
				prependFrame = $('<div class="dimmed-frame"></div>');
			if (!_this.get(0)){return false}
			prependFrame.css({height:$('#wrap').outerHeight(true),opacity:0.5})
			prependFrame.prependTo(_this);
		},
		closeFocus:function() {
			var _this = $(this);
			if (!_this.get(0)){return false}
			$.each(_this,function() {
				var _this = $(this),	
				closeBtn = _this.find('.close-btn');
				closeBtn.focus();
			})
		},
		layerpopupControl:function() {
			var _this = $(this);
			if (!_this.get(0)){return false}
			$.each(_this,function() {
				var _this = $(this);
				_this.click(function() {
					$('body').dimmedFrame();
					$($(this).attr('href')).css({top:$(window).scrollTop()+100}).show();	
					$($(this).attr('href')).closeFocus();
					$($(this).attr('href')).find('.close-btn').attr('href','#'+$(this).attr('id'))
					return false;
				})
			})
		},
		layerpopupClose:function() {
			var _this = $(this),
				closeBtn = _this.find('.close-btn');
			if (!_this.get(0)){return false}
			closeBtn.click(function() {
				$('.dimmed-frame').remove();
				_this.hide();	
				$(this).focusout();
				$($(this).attr('href')).focus();
				return false;
			})
		},
		addOnClass:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
				item = _this.find('a');
				item.eq(0).parent().addClass('over');
				$.each(item,function() {
					$(this).click(function() {
						var clearOn = _this.find('.over');
						clearOn.removeClass('over');
						$(this).parent().addClass('over');
						return false;
					})
				})
			})
		},
		addOnClass2:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
				item = _this.find('a');
				item.eq(0).parent().addClass('over');
				$.each(item,function() {
					$(this).click(function() {
						var clearOn = _this.find('.over');
						clearOn.removeClass('over');
						$(this).parent().addClass('over');
					})
				})
			})
		},
		Navifollow:function() {
			var _this = $(this);
			var ScrollLi = [];
			var ScrollAA;
			var ScrollPoint;
			var runpoint;
			if ($('#contents-follow-wraper').is(':visible')) {
				$(window).load(function() {
					ScrollAA = _this.offset().top;
					ScrollPoint = _this.find('#contents-follow-wraper').height()-1;
					$('.contents-follow li a').click(function() {
						if (!$(this).is('.link')) {
							var ScrollCu = $($(this).attr('href')).offset().top;
							$('html, body').animate({scrollTop:ScrollCu-ScrollPoint},{duration:500, easing:'easeInOutQuart'})
							return false;
						}
					});
					
					
					$('.article-section').each(function(index) {
						ScrollLi[index] = parseInt($(this).offset().top,10)-70;
					});
					$(window).scroll(function() {
						if (!$('.contents-follow li a').is('.link')) {
							$('.contents-follow li a').parent().removeClass('on');
						}
						if ( $(window).scrollTop() > ScrollAA ) {
							if (!runpoint) {
								_this.addClass('sticky');
								$('<iframe id="cover-frame" frameborder="0" scrolling="no" style="width:100%; height:36px; margin-top:-36px;" title="내용없음"></iframe>').css({opacity:0}).appendTo($('#contents-follow-wrap'));
								runpoint = 1;
							}
							if (!$('.contents-follow li a').is('.link')) {
								for ( var i=0; i<ScrollLi.length; i++ ) {
									if ( i == ScrollLi.length-1 ) {
										if ( ScrollLi[i] < $(window).scrollTop() ) {
											$('.contents-follow li a').eq(i).parent().addClass('on');
											
											break;
											
										}
									} else {
										if ( ( ScrollLi[i] < $(window).scrollTop() ) && ( ScrollLi[i+1] > $(window).scrollTop() ) ) {
											$('.contents-follow li a:not(.outSider)').eq(i).parent().addClass('on');
											
											break;
										}
									}
								}	
							}
						} else {
							if (runpoint) {
								_this.removeClass('sticky');
								$('#cover-frame').remove();
								runpoint = 0;
							}
						}
					});

				})
			}
		},
		detailTabcontrol:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
				tab = _this.find('.selelct-contents'),
				tabanc = tab.find('option'),
				tabcont = _this.find('>.price-table-style');
				tabcont.hide();
				$.each(tabanc,function(index) {
					tab.change(function() {
						$(this).next().attr('href',$(this).attr('value'));
						$(this).next().click(function() {
							var hidecont = _this.find('.on-view');
							hidecont.removeClass('on-view').hide();
							$($(this).attr('href')).addClass('on-view').show();
							return false;
						})
						//$($(this).attr('value')).addClass('on-view').show();
					})
				})
				$(tab.find('> option').first().attr('value')).show().addClass('on-view');		
			})
		},
		optionalControl:function() {
			var _this = $(this),
				targetParent = _this.find('.select-area'),
				target = targetParent.find('.sort'),
				sTarget = targetParent.find('.detail'),
				gPlace = _this.find('.gallery-place-wrap');
				runbutton = _this.find('.final-search');
				sTarget.hide();
				gPlace.hide();
			$(target.find('>option').first().attr('value')).show().addClass('on-select');
			$(sTarget.find('>option').first().attr('value')).show().addClass('on-gallery');
			target.change(function() {
				var hideselect = _this.find('.on-select');
					hideselect.removeClass('on-select').hide();	
				$($(this).attr('value')).addClass('on-select').show(1,function() {
					$(this).find('>option').first().attr('selected','selected');
					_this.find('.final-search').attr('href',$(this).attr('value'))
				})
			})
			sTarget.change(function() {
				_this.find('.final-search').attr('href',$(this).attr('value'))
			})
			runbutton.click(function() {
				var hidecont = _this.find('.on-gallery');
					hidecont.removeClass('on-gallery').hide();
				$($(this).attr('href')).addClass('on-gallery').show();
				$('.slide-cutter').thumbReplace();
				return false;
			})
		},
		thumbReplace:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					item = _this.find('a');
				item.first().addClass('focus');
				_this.parent().prev().find('.place-thumb').attr('src',item.first().find('img').attr('src'))
				_this.parent().prev().find('.place-thumb').attr('alt',item.first().find('img').attr('alt'))
				$.each(item,function() {
					$(this).click(function() {
						if (!$(this).is('.focus')) {
							var hideFous = _this.find('.focus');
							hideFous.removeClass('focus')
							$(this).addClass('focus')		
							_this.parent().prev().find('.place-thumb').attr('src',$(this).find('img').attr('src'))
							_this.parent().prev().find('.place-thumb').attr('alt',$(this).find('img').attr('alt'))
						}
						return false;
					})
				})
			})
		},
		galleryPlace:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					up = _this.find('.up-control'),
					down =  _this.find('.down-control'),
					obj = _this.find('.slide-cutter > ul'),
					item = obj.find('>li'),
					num = 0,
					time = 500;
				if (item.length <=4) {
					up.attr('disabled','disabled').addClass('disabled');	
					down.attr('disabled','disabled').addClass('disabled');	
				} else {
					down.attr('disabled','disabled').addClass('disabled');
				}
				obj.css({height:item.height()*item.length})
				up.click(function() {
					num++;
					obj.animate({marginTop:-(item.height()*(num*4))},time);
					if (num == Math.ceil(item.length/4)-1) {
						$(this).attr('disabled','disabled').addClass('disabled');
					}
					if (down.is('.disabled')) {
						down.removeAttr('disabled').removeClass('disabled');	
					}
				})
				down.click(function() {
					num--;
					obj.animate({marginTop:-(item.height()*(num*4))},time);
					if (num == 0) {
						$(this).attr('disabled','disabled').addClass('disabled');
					}
					if (up.is('.disabled')) {
						up.removeAttr('disabled').removeClass('disabled');	
					}
				})
				_this.touchwipe({
					wipeUp: function(){
						if(!up.is('.disabled')){
							up.trigger('click')	
						}
					},
					wipeDown: function(){
						if(!down.is('.disabled')){
							down.trigger('click')
						}
					},
					min_move_y: 20,
					preventDefaultEvents: true
				});
				$('.slide-cutter').thumbReplace();
			})
		},
		ancFollow:function() {
			var _this = $(this),
				moveControl = _this.find('a');
			$.each(moveControl,function() {
				$(this).click(function() {
					$('html, body').animate({scrollTop:$($(this).attr('href')).offset().top - 67},{duration:500, easing:'easeInOutQuart'})
					return false;
				})
			})		
		},
		thanksControl:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					item = _this.find('>.thankyou-secom-wrap');
				//item.hide();
				//item.eq(0).addClass('on-cell').show();
				$.each(item,function(index) {
					var contRol = $(this).find('.control-btn');
					var circle = _this.find('button.circle');
					$.each(circle,function() {
						//circle.eq(0).addClass('on-circle');
						$(this).click(function() {
							var onCircle = $(this).parent().find('.on-circle'),
								onCell = $(this).parent().parent().find('.on-cell');
							onCircle.removeClass('on-circle');
							onCell.removeClass('on-cell').hide();
							
							$(this).addClass('on-circle');
							$(this).next().addClass('on-cell').show();
						})
					})
					contRol.live('click', function() {
						$(this).parent().toggleClass('open');	
						$(this).parent().parent().parent().css({height:$(this).parent().height()+80});	
					})
				})
			})
		},
		galleryPlace2:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					left = _this.find('.left-control'),
					right =  _this.find('.right-control'),
					obj = _this.find('.pr-thumbnail-list > ul'),
					item = obj.find('>li'),
					num = 0,
					time = 500;
				if (item.length <=5) {
					left.attr('disabled','disabled').addClass('disabled');	
					right.attr('disabled','disabled').addClass('disabled');	
				} else {
					left.attr('disabled','disabled').addClass('disabled');
				}
				obj.css({width:item.outerWidth(true)*item.length})
				right.click(function() {
					num++;
					obj.animate({marginLeft:-(item.outerWidth(true)*(num*5))},time);
					if (num == Math.ceil(item.length/5)-1) {
						$(this).attr('disabled','disabled').addClass('disabled');
					}
					if (left.is('.disabled')) {
						left.removeAttr('disabled').removeClass('disabled');	
					}
				})
				left.click(function() {
					num--;
					obj.animate({marginLeft:-(item.outerWidth(true)*(num*5))},time);
					if (num == 0) {
						$(this).attr('disabled','disabled').addClass('disabled');
					}
					if (right.is('.disabled')) {
						right.removeAttr('disabled').removeClass('disabled');	
					}
				})
				_this.touchwipe({
					wipeLeft: function(){
						if(!left.is('.disabled')){
							left.trigger('click')	
						}
					},
					wipeRight: function(){
						if(!right.is('.disabled')){
							right.trigger('click')
						}
					},
					min_move_x: 20,
					preventDefaultEvents: true
				});
			})
		},
		serviceMap:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this);
					map = _this.find('> area');
				$.each(map,function() {
					$(this).click(function() {
						$(this).parent().prev().attr('src',$(this).attr('href'))
						return false;
					})
					$(this).focusin(function() {
						$(this).parent().prev().attr('src',$(this).attr('href'))
						return false;
					})
				})
			})
		},
		matchAncContents:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					anc = _this.find('.tab-anc'),
					cont1 = _this.find('.title');
				$('.service-map').serviceMap();
				cont1.hide();
				anc.eq(0).addClass('show').focus();
				anc.eq(0).parent().parent().addClass('on-service');
				anc.eq(0).next().addClass('show2').show();
				$.each(anc,function() {
					$(this).click(function() {
						var showCheck = _this.find('.show'),
							showCheck2 = _this.find('.show2'),
							showCheck3 = _this.find('.on-service');
							
							showCheck.removeClass('show');
							showCheck2.removeClass('show2').hide();
							showCheck3.removeClass('on-service');
										
						$(this).addClass('show');
						$(this).parent().parent().addClass('on-service')
						$(this).next().addClass('show2').show();
						var altVal = $.trim($(this).text());
						$.each($(this).parent().parent().parent().parent().parent().find('area'),function() {
							var mapAltVal = $.trim(this.alt);
							//console.log(mapAltVal)
							
							if(altVal.indexOf("방범") > -1 || altVal.indexOf("영상기기") > -1 ||  altVal.indexOf("경고방송") > -1
								 ||(altVal.indexOf("이상통보") > -1 && altVal.indexOf("서비스") > -1)
									){
								if(mapAltVal.indexOf("세콤판넬") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("출입관리") > -1){
								if(mapAltVal.indexOf("카드리더기") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("영상관제") > -1){
								if(mapAltVal.indexOf("영상감지기") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("영상감시") > -1 || altVal.indexOf("영상보안") > -1){
								if(mapAltVal.indexOf("CCTV") > -1 
										//|| mapAltVal.indexOf("IP카메라") > -1 || mapAltVal.indexOf("NVR") > -1 || mapAltVal.indexOf("DVR") > -1
										){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("정보보안") > -1){
								if(mapAltVal.indexOf("에스원NS") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("AED") > -1){
								if(mapAltVal.indexOf("AED") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("금고") > -1){
								if(mapAltVal.indexOf("금고") > -1 && mapAltVal.indexOf("진동감지기") == -1 && mapAltVal.indexOf("금고감지기") == -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("통합") > -1 && altVal.indexOf("관제센터") > -1){
								if(mapAltVal.indexOf("통합") > -1 && mapAltVal.indexOf("관제센터") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("출동경비") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("출동경비") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("화상감시") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("화상감시") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("출입통제") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("출입통제") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("승강기운영") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("승강기운영") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("차량통제") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("차량통제") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("차번인식") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("차번인식") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("주차유도") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("주차유도") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("스피드") > -1 && altVal.indexOf("게이트") > -1){
								if(mapAltVal.indexOf("SpeedGate") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("검색장비") > -1 ){
								if(mapAltVal.indexOf("검색장비") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("무인택배") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("무인택배") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("도청방지") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도청방지") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("무인택배") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("무인택배") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("도청방지") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도청방지") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("무인택배") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("무인택배") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("도청방지") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도청방지") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("가스누출") > -1 && altVal.indexOf("이상통보") > -1){
								if(mapAltVal.indexOf("가스감지") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("가스차단") > -1){
								if(mapAltVal.indexOf("가스벨브제어") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("화재이상") > -1 && altVal.indexOf("통보") > -1){
								if(mapAltVal.indexOf("화재감지") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("전등제어") > -1){
								if(mapAltVal.indexOf("전등제어") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("영상확인") > -1){
								if(mapAltVal.indexOf("세콤영상리모콘") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("정보보호") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("정보보호") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("카드발급") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("카드발급시스템") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("전자출결") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("전자출결시스템") > -1){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false; 
								}
							}else if(altVal.indexOf("전자지불") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("전자지불시스템") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("대기전력차단") > -1){ 
								if(mapAltVal.indexOf("대기전력차단") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("안심폰") > -1){
								if(mapAltVal.indexOf("안심폰") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							
							else if(altVal.indexOf("경계통보") > -1){
								if(mapAltVal.indexOf("경계버튼") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							/*else if(altVal.indexOf("출입관리") > -1){
								if(mapAltVal.indexOf("출석정보관리") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}*/
							else if(altVal.indexOf("출입관리") > -1){
								if(mapAltVal.indexOf("출석정보관리") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("DVR이상관리") > -1){
								if(mapAltVal.indexOf("DVR") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("경계통보") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("경계버튼") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							} 
							else if(altVal.indexOf("스마트폰") > -1 && altVal.indexOf("어플리케이션") > -1){
								if(mapAltVal.indexOf("스마트폰") > -1 && mapAltVal.indexOf("어플리케이션") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("도서관") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도서관시스템") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("홍보/안내") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("홍보안내키오스크") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("긴급출동") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("긴급출동") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}  
							}else if(altVal.indexOf("스페셜") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("스페셜") > -1 && mapAltVal.indexOf("보상서비스") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}  
							}else if(altVal.indexOf("근태/식당") > -1){
								if(mapAltVal.indexOf("근태/식당") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								} 
							}else if(altVal.indexOf("SMS서비스") > -1){
								if((mapAltVal.indexOf("SMS") > -1 ||  mapAltVal.indexOf("sms") > -1   )&& altVal.indexOf("서비스") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("365코너") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("365코너") > -1  && altVal.indexOf("서비스") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("비상통보") > -1 && altVal.indexOf("서비스") > -1){
								if((mapAltVal.indexOf("무선") > -1 && mapAltVal.indexOf("비상") > -1 ) ||  mapAltVal.indexOf("비상버튼") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}  
							}
						});
						return false;
					})
					$(this).focusin(function() {
						var showCheck = _this.find('.show'),
							showCheck2 = _this.find('.show2'),
							showCheck3 = _this.find('.on-service');
							
							showCheck.removeClass('show');
							showCheck2.removeClass('show2').hide();
							showCheck3.removeClass('on-service');
										
						$(this).addClass('show');
						$(this).parent().parent().addClass('on-service')
						$(this).next().addClass('show2').show();
						var altVal = $.trim($(this).text());
						$.each($(this).parent().parent().parent().parent().parent().find('area'),function() {
							var mapAltVal = $.trim(this.alt);
							
							if(altVal.indexOf("방범") > -1 || altVal.indexOf("영상보안") > -1 ||  altVal.indexOf("경고방송") > -1
								 ||(altVal.indexOf("이상통보") > -1 && altVal.indexOf("서비스") > -1)
									){
								if(mapAltVal.indexOf("세콤판넬") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("출입관리") > -1){
								if(mapAltVal.indexOf("카드리더기") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("영상관제") > -1){
								if(mapAltVal.indexOf("영상감지기") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("영상감시") > -1 || altVal.indexOf("영상보안") > -1){
								if(mapAltVal.indexOf("CCTV") > -1 
										//|| mapAltVal.indexOf("IP카메라") > -1 || mapAltVal.indexOf("NVR") > -1 || mapAltVal.indexOf("DVR") > -1
										){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("정보보안") > -1){
								if(mapAltVal.indexOf("세콤NS") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("AED") > -1){
								if(mapAltVal.indexOf("AED") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("금고") > -1){
								if(mapAltVal.indexOf("금고") > -1 && mapAltVal.indexOf("진동감지기") == -1 && mapAltVal.indexOf("금고감지기") == -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("통합") > -1 && altVal.indexOf("관제센터") > -1){
								if(mapAltVal.indexOf("통합") > -1 && mapAltVal.indexOf("관제센터") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("출동경비") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("출동경비") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("화상감시") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("화상감시") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("출입통제") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("출입통제") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("승강기운영") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("승강기운영") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("차량통제") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("차량통제") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("차번인식") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("차번인식") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("주차유도") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("주차유도") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("스피드") > -1 && altVal.indexOf("게이트") > -1){
								if(mapAltVal.indexOf("SpeedGate") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("검색장비") > -1 ){
								if(mapAltVal.indexOf("검색장비") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("무인택배") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("무인택배") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("도청방지") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도청방지") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("무인택배") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("무인택배") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("도청방지") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도청방지") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("무인택배") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("무인택배") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("도청방지") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도청방지") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("가스누출") > -1 && altVal.indexOf("이상통보") > -1){
								if(mapAltVal.indexOf("가스감지") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("가스차단") > -1){
								if(mapAltVal.indexOf("가스벨브제어") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("화재이상") > -1 && altVal.indexOf("통보") > -1){
								if(mapAltVal.indexOf("화재감지") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("전등제어") > -1){
								if(mapAltVal.indexOf("전등제어") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("영상확인") > -1){
								if(mapAltVal.indexOf("세콤영상리모콘") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("정보보호") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("정보보호") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("카드발급") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("카드발급시스템") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("전자출결") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("전자출결시스템") > -1){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false; 
								}
							}else if(altVal.indexOf("전자지불") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("전자지불시스템") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("대기전력차단") > -1){ 
								if(mapAltVal.indexOf("대기전력차단") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("안심폰") > -1){
								if(mapAltVal.indexOf("안심폰") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("경계통보") > -1){
								if(mapAltVal.indexOf("경계버튼") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							/*else if(altVal.indexOf("출입관리") > -1){
								if(mapAltVal.indexOf("출석정보관리") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}*/
							else if(altVal.indexOf("출입관리") > -1){
								if(mapAltVal.indexOf("출석정보관리") > -1 ){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("DVR이상관리") > -1){
								if(mapAltVal.indexOf("DVR") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("경계통보") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("경계버튼") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							} 
							else if(altVal.indexOf("스마트폰") > -1 && altVal.indexOf("어플리케이션") > -1){
								if(mapAltVal.indexOf("스마트폰") > -1 && mapAltVal.indexOf("어플리케이션") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("도서관") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("도서관시스템") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}
							else if(altVal.indexOf("홍보/안내") > -1 && altVal.indexOf("시스템") > -1){
								if(mapAltVal.indexOf("홍보안내키오스크") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("긴급출동") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("긴급출동") > -1 && mapAltVal.indexOf("시스템") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}  
							}else if(altVal.indexOf("스페셜") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("스페셜") > -1 && mapAltVal.indexOf("보상서비스") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}  
							}else if(altVal.indexOf("근태/식당") > -1){
								if(mapAltVal.indexOf("근태/식당") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								} 
							}else if(altVal.indexOf("SMS서비스") > -1){
								if((mapAltVal.indexOf("SMS") > -1 ||  mapAltVal.indexOf("sms") > -1   )&& altVal.indexOf("서비스") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("365코너") > -1 && altVal.indexOf("서비스") > -1){
								if(mapAltVal.indexOf("365코너") > -1  && altVal.indexOf("서비스") > -1){
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}
							}else if(altVal.indexOf("비상통보") > -1 && altVal.indexOf("서비스") > -1){
								if((mapAltVal.indexOf("무선") > -1 && mapAltVal.indexOf("비상") > -1 ) ||  mapAltVal.indexOf("비상버튼") > -1 ){ 
									$(this).parent().prev().attr('src',$(this).attr('href'));
									return false;
								}  
							}
						});
						return false;
					})
				})
			})
		},
		stopfn:function() {
			return false;			
		},
		securityArea:function() {
			var _this = $(this),
				cover = _this.find('.spot-thumb'),
				popLink = _this.find('.pop-link'),
				popupBox = _this.find('.security-area-popup');	 
			//popupBox.hide();
			$.each(cover,function() {
				$(this).click(function() {
					var checkOver = _this.find('.cover-hide');
					checkOver.removeClass('cover-hide');
					checkOver.find('.spot-thumb').show();
					$(this).parent().addClass('cover-hide');
					$(this).hide();
					return false;
				});
			})
			$.each(popLink,function() {
				var $this = $(this)
				if ($this.parent().is('.office')) {
					$this.click(function() {
						var checkOver = _this.find('.cover-hide');
						checkOver.removeClass('cover-hide');
						checkOver.find('.spot-thumb').show();
						$($this.attr('href')).show();
						$($this.attr('href')).find('.area-popup-close').click(function() {
							$(this).parent().parent().hide();
							$($(this).attr('href')).focus();
							return false;
						});
						$($this.attr('href')).find('.area-popup-contents').matchAncContents();
						return false;
					})
				} else {
					$this.click(function() {
						$($this.attr('href')).show();
						$($this.attr('href')).find('.area-popup-close').click(function() {
							$(this).parent().parent().hide();
							$($(this).attr('href')).focus();
							return false;
						})
						$($this.attr('href')).find('.area-popup-contents').matchAncContents();
						return false;
					})			
				}
			})
		},
		solutionLink:function() {
			var _this = $(this);
			$.each(_this,function() {
				var _this = $(this),
					anc = _this.find('a'); 
				_this.next().hide();
				anc.click(function() {
					$(this).toggleClass('on');
					$(this).parent().next().toggle();
					return false;
				})
			})
		},
		familySite:function() {
			var _this = $(this);
				control = _this.find('.familysite-defult > a');
			control.click(function() {
				if (!$(this).parent().is('.site-expose')) {
					$(this).parent().addClass('site-expose');
					$(this).parent().prev().show();
					$(this).find('>img').attr('alt','패밀리사이트 닫기');
					$($(this).attr('href')).focus();
				} else {
					$(this).parent().removeClass('site-expose');
					$(this).parent().prev().hide();
					$(this).find('>img').attr('alt','패밀리사이트 열기');
				}
				return false;
			})
		},
		locationInfo:function() {
			var _this = $(this);
				control = _this.find('.info-view');
				list = _this.find('.information-list');
			list.eq(0).addClass('list-view')
			$.each(control,function() {
				$(this).click(function() {
					var checkView = _this.find('.list-view');
					checkView.removeClass('list-view')
					$($(this).attr('href')).addClass('list-view');
					return false;
				})
			})
		}
	})
	$(document).ready(function() {
		$('.layer-control').layerpopupControl();
		$('.layer-pop-wrap').layerpopupClose();
		$('.layer-pop-wrap02').layerpopupClose();
		$('#container').Navifollow();

		var nowlink = location.pathname;
		var target;
		var list = $("#navigation ul span a");
		for(var i=0; i<list.size(); i++){
			var $obj = $(list.get(i));
			if($obj.attr("href").indexOf(nowlink) >-1 || ( $obj.attr("onclick") && ($obj.attr("onclick") +"").indexOf(nowlink) >-1 )) {
				target = $obj;
			}
		}
		if(target){
			$(target).parent().parent().parent().parent().parent().addClass("menu-on");
		}
	})
})(jQuery)