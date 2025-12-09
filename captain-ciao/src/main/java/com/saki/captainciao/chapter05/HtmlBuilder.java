package com.saki.captainciao.chapter05;

public class HtmlBuilder {

	public static void main(String[] args) {

		System.out.println(htmlElement("b", "strong is bold"));
		System.out.println(bold(emphasized("strong + emphasized")));
		System.out.println(htmlElement("span", null));
		System.out.println(htmlElement("", "no"));
		System.out.println(htmlElement(null, "not bold"));
		System.out.println(htmlElement(null, null));
	}

	public static String htmlElement(String tag, String body) {
		String result;
		if (body == null) {
			body = "";
		}

		if (tag == null || tag.isEmpty()) {
			return body;
		} else {
			result = String.format("<%s>%s</%s>", tag, body, tag);

		}

		return result;

	}

	public static String bold(String body) {
		return htmlElement("bold", body);
	}

	public static String emphasized(String body) {
		return htmlElement("em", body);
	}

}
